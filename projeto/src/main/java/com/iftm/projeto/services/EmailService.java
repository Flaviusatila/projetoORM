package com.iftm.projeto.services;

import com.iftm.projeto.models.Email;
import com.iftm.projeto.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public Email save(Email emailBody) {
        return emailRepository.save(emailBody);
    }

    public Email findById(Long id) {
        return emailRepository.findById(id).orElseThrow();
    }

    public Email update(Email emailBody) {
        return emailRepository.save(emailBody);
    }

    public void delete(Long id) {
        emailRepository.delete(findById(id));
    }
}
