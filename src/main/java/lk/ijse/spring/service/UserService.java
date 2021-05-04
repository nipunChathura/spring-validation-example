package lk.ijse.spring.service;

import lk.ijse.spring.entity.User;
import lk.ijse.spring.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 5/4/2021
 **/

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User createUser(User user){
        return userRepo.save(user);
    }
}
