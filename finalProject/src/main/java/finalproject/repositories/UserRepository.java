package finalproject.repositories;

import finalproject.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

    User findByNameAndPassword(String name, String password);
}
