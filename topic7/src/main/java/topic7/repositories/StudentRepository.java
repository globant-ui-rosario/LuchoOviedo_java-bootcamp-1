package topic7.repositories;

import org.springframework.data.repository.CrudRepository;
import topic7.model.Student;

public interface StudentRepository  extends CrudRepository<Student,Integer>{



}
