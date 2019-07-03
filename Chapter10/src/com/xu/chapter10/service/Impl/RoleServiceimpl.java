package com.xu.chapter10.service.Impl;

import com.xu.chapter10.pojo.Role;
import com.xu.chapter10.service.RoleService;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceimpl implements RoleService {
    @Override
    public void printRoleinfo(Role role) {
        System.out.println("id= " + role.getId());
        System.out.println("roleName= " + role.getRoleName());
        System.out.println("note= " + role.getNote());
    }
}
