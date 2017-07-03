package finalproject.services;

import finalproject.model.User;
import finalproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private List<User> usersLoggedOn = new ArrayList<>();

    @Override
    public void addUser(User user) {
        User existingUser = userRepository.findByNameAndPassword(user.getName(), user.getPassword());

        if (existingUser == null) {
            userRepository.save(user);

        }
    }

    @Override
    public User login(String name, String password) {

        User user = userRepository.findByNameAndPassword(name, password);

        if (user == null) {

            user = new User();
            user.setName("not registered user");
            user.setPassword("not registered user");

        } else {

            if (!isOn(user.getId())) {

                usersLoggedOn.add(user);

            }
        }

        return user;
    }

    @Override
    public boolean isOn(Integer id) {

        boolean isOn = false;

        for (User user : usersLoggedOn) {

            if (user.getId() == id) {

                isOn = true;

            }
        }

        return isOn;
    }


}
