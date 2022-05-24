package com.letscode.ecommerce.userapi.controller;

import com.letscode.ecommerce.userapi.entity.UserEntity;
import com.letscode.ecommerce.userapi.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> listAll() {
        List<UserEntity> users = userService.listAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserEntity> getById(@PathVariable Long id) {
        UserEntity user = userService.getById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user")
    public ResponseEntity<UserEntity> newUser(@RequestBody UserEntity userEntity) {
        UserEntity user = userService.create(userEntity);
        return ResponseEntity.ok(user);
    }




}
