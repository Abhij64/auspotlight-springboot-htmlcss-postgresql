package com.example.test;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
    User findByUsernameAndPassword1(String username,String password1);

    User findByUsername(String loggedInUsername);
}
