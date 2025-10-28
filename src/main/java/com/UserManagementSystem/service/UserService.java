package com.UserManagementSystem.service;

import com.UserManagementSystem.dto.UserDTO;
import com.UserManagementSystem.dto.mapper.UserMapper;
import com.UserManagementSystem.entity.User;
import com.UserManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.UserManagementSystem.entity.*;

import java.util.List;


@Service

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addUser(UserDTO userDTO) {
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            return "User with email " + userDTO.getEmail() + " already exists.";
        }


        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setActive(userDTO.getActive() != null ? userDTO.getActive() : true);
        if(userDTO.getRole() != null){
            user.setRole(userDTO.getRole());
        }
        userRepository.save(user);
        return "User added successfully.";
    }
    public String updateUser(Long id , UserDTO userDTO) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        UserMapper.updateUserFromDTO(userDTO, existingUser);

        userRepository.save(existingUser);
        return "User updated successfully.";
    }

    public String deleteUser(Long id) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));



        userRepository.delete(existingUser);
        return "User deleted successfully.";
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }





}
