package com.UserManagementSystem.dto.mapper;

import com.UserManagementSystem.dto.UserDTO;
import com.UserManagementSystem.entity.User;

public class UserMapper {

    public static UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setRole(user.getRole());
        userDTO.setActive(user.getActive());
        return userDTO;
    }

    public static User userDTOToUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        if(userDTO.getRole() != null){
            user.setRole(userDTO.getRole());
        }
        user.setActive(userDTO.getActive() != null ? userDTO.getActive() : true);
        return user;
    }

    public static void updateUserFromDTO(UserDTO userDTO, User user) {

        if (userDTO.getName() != null) {
            user.setName(userDTO.getName());
        }
        if (userDTO.getEmail() != null) {
            user.setEmail(userDTO.getEmail());
        }
        if (userDTO.getPassword() != null) {
            user.setPassword(userDTO.getPassword());
        }
        if (userDTO.getRole() != null) {
            user.setRole(userDTO.getRole());
        }
        if (userDTO.getActive() != null) {
            user.setActive(userDTO.getActive());
        }
    }


}
