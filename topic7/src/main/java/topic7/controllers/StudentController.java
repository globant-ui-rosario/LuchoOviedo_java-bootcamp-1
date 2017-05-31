package topic7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import topic7.model.Course;
import topic7.model.Student;
import topic7.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/students")
    public List<Student> fetchAllStudents(){
        List<Student> students = new ArrayList<Student>();
        Iterator iterator = studentRepository.findAll().iterator();

        while (iterator.hasNext()){
            students.add((Student)iterator.next());
        }

        return students;

    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void createStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/studentsQuantity")
    public long studentsQuantity(){
        return studentRepository.count();
    }

    @RequestMapping(value = "student/{id}/courses",method = RequestMethod.GET)
    public List <Course> getStudentCourses(@PathVariable int id){
        Student student = studentRepository.findOne(id);

        if(student != null){
            return student.getCourses();
        } else {
            return null;
        }
    }
}
