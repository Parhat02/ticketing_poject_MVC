package org.cydeo.service.impl;

import org.cydeo.dto.UserDTO;
import org.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {
    @Override
    public UserDTO save(UserDTO user) {
        return super.save(user.getUserName(), user);
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
