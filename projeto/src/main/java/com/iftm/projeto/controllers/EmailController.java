package com.iftm.projeto.controllers;

import com.iftm.projeto.models.Email;
import com.iftm.projeto.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity salva(@RequestBody Email emailBody){
        return ResponseEntity.ok(emailService.save(emailBody));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        return ResponseEntity.ok(emailService.findById(id));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Email emailBody){
        return ResponseEntity.ok(emailService.update(emailBody));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        emailService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
