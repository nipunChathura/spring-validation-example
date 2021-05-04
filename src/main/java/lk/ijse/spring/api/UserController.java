package lk.ijse.spring.api;

import lk.ijse.spring.entity.User;
import lk.ijse.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 5/4/2021
 **/

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User user1 = userService.createUser(user);
        return new ResponseEntity<User>(user1, HttpStatus.CREATED);
    }

}
