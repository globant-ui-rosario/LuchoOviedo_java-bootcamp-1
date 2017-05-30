package topic7.repositories;

import org.springframework.data.repository.CrudRepository;
import topic7.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher,Integer>{
}
