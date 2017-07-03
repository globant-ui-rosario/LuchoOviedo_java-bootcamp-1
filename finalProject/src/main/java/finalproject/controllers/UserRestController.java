package finalproject.controllers;

import finalproject.model.User;
import finalproject.repositories.UserRepository;
import finalproject.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void addUser(@RequestBody User user) {

        userService.addUser(user);

    }

    @RequestMapping(method = RequestMethod.GET, value = "/listUsers")
    public List<User> fetchAllUsers() {
        List<User> users = new ArrayList<User>();
        Iterator<User> iterator = userRepository.findAll().iterator();
        while (iterator.hasNext()) {
            users.add((User) iterator.next());
        }
        return users;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{name}/{password}")
    public User userLogin(@PathVariable String name, @PathVariable String password) {

        return userService.login(name, password);

    }

}
