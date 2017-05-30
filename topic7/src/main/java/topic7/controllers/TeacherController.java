package topic7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import topic7.model.Teacher;
import topic7.repositories.TeacherRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/teachers")
    public List<Teacher> fetchAllTeachers (){
        List<Teacher> teachers = new ArrayList<Teacher>();
        Iterator<Teacher> iterator = teacherRepository.findAll().iterator();
        while(iterator.hasNext()){
            teachers.add((Teacher) iterator.next());
        }
        return teachers;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/teacher")
    public void createTeacher(@RequestBody Teacher teacher){
        teacherRepository.save(teacher);
    }

}
