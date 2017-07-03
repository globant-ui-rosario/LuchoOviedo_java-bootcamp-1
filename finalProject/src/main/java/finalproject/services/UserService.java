package finalproject.services;

import finalproject.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void addUser(User user);

    User login(String name, String password);

    boolean isOn (Integer id);

}
