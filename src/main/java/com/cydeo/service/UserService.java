package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO save(UserDTO user );
    UserDTO findById(String userName);
    List<UserDTO> find();
    void deleteById(String userName);
}
