package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface UserService extends CrudService<UserDTO,String> {
    UserDTO save(UserDTO user);
    UserDTO findByID(String userName);
    List<UserDTO>findAll();
    void deleteById(String userName);
}
