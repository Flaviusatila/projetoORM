package com.iftm.projeto.controllers;

import com.iftm.projeto.models.Email;
import com.iftm.projeto.models.User;
import com.iftm.projeto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity salva(@RequestBody User userBody){
        return ResponseEntity.ok(userService.save(userBody));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody User userBody){
        return ResponseEntity.ok(userService.update(userBody));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
