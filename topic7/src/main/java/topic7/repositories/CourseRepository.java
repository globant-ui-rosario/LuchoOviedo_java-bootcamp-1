package topic7.repositories;

import org.springframework.data.repository.CrudRepository;
import topic7.model.Course;

public interface CourseRepository extends CrudRepository <Course,Integer>{
}
