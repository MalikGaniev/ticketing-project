package com.cydeo.service;

import com.cydeo.dto.RoleDto;
import com.cydeo.dto.UserDTO;

import java.util.List;

public interface CrudService <T,ID> {
    T save(T role);
   T findById(Long id);
    List<T> findAll();
    void deleteById(Long id);
}

