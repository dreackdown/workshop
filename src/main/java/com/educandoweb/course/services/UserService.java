package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        LOGGER.info("Retorno de Users com sucesso");
        return userRepository.findAll();
    }

    public User fyndById(Long id){
        Optional<User> obj = userRepository.findById(id);
        LOGGER.info("Retorno do user: " + obj.get().getName());
        return obj.get();
    }
}
