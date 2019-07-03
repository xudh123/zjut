package com.xu.chapter10.service.Impl;
import com.xu.chapter10.pojo.Role;
import com.xu.chapter10.service.RoleService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceimpl2 implements RoleService2{
    @Autowired
    private Role role = null;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public void printRoleInfo() {
        System.out.println("id= " + role.getId());
        System.out.println("roleName= " + role.getRoleName());
        System.out.println("note= " + role.getNote());
    }
}
