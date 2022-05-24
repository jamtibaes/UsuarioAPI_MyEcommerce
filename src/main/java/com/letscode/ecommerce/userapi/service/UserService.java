package com.letscode.ecommerce.userapi.service;

import com.letscode.ecommerce.userapi.entity.UserEntity;
import com.letscode.ecommerce.userapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Observable;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> listAll() {
        return userRepository
                .findAll()
                .stream()
                .collect(Collectors.toList());
    }

    public UserEntity create(UserEntity userEntity) {
        UserEntity user = userRepository.save(userEntity);
        return user;
    }

    public UserEntity getById(Long id) {
        return userRepository
                .findById(id)
                .orElse(null);
    }

}
