package com.cydeo.service.impl;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl extends AbstractMapService<UserDTO,String> implements UserService {

    @Override
    public UserDTO save(UserDTO user) {
        return super.save(user.getUserName(),user);
    }

    @Override
    public UserDTO findById(String userName) {
        return super.findById(userName);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String userName) {
             super.deleteById(userName);
    }
}
