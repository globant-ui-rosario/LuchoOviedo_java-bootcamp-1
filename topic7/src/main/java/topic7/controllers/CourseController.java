package topic7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import topic7.model.Course;
import topic7.model.Student;
import topic7.repositories.CourseRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/courses")
    public List<Course> fetchAllTheCourses(){
        List <Course> courses = new ArrayList<Course>();
        Iterator<Course> iterator = courseRepository.findAll().iterator();
        while(iterator.hasNext()){
            courses.add((Course)iterator.next());
        }
        return courses;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/course")
    public void createCourses(@RequestBody Course course){
        courseRepository.save(course);
    }

    @RequestMapping(value = "course/{id}/students",method = RequestMethod.GET)
    public List<Student> getCourseStudents(@PathVariable int id){
        Course course = courseRepository.findOne(id);
        if (course != null){
            return course.getStudents();
        } else {
            return null;
        }
    }
}
