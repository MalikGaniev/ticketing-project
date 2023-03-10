package com.cydeo.service.impl;

import com.cydeo.dto.RoleDto;
import com.cydeo.service.RoleService;

import java.util.List;

public class RoleServiceImpl extends AbstractMapService<RoleDto,Long> implements RoleService {


    @Override
    public RoleDto save(RoleDto role) {
        return super.save(role.getId(),role);
    }

    @Override
    public RoleDto findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<RoleDto> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
super.deleteById(id);
    }


}
