package lk.ijse.spring.repository;

import lk.ijse.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 5/4/2021
 **/


public interface UserRepo extends JpaRepository<User, Long> {
}
