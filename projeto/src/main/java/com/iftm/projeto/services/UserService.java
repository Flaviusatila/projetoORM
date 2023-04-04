package com.iftm.projeto.services;

import com.iftm.projeto.models.User;
import com.iftm.projeto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User userBody) {
        return userRepository.save(userBody);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User update(User userBody) {
        return userRepository.save(userBody);
    }

    public void delete(Long id) {
        userRepository.delete(findById(id));
    }
}
