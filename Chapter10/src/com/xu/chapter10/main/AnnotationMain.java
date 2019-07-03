package com.xu.chapter10.main;

import com.xu.chapter10.config.ApplicationConfig;
import com.xu.chapter10.pojo.PojoConfig;
import com.xu.chapter10.service.RoleService;
import com.xu.chapter10.service.RoleService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xu.chapter10.pojo.Role;

public class AnnotationMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        /*Role role = context.getBean(Role.class);
        RoleService roleService = context.getBean(RoleService.class);
        roleService.printRoleinfo(role);*/
        RoleService2 roleService2 = context.getBean(RoleService2.class);
        roleService2.printRoleInfo();
        context.close();
        /*ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        Role role = context.getBean(Role.class);
        System.out.println(role.getId());*/
    }
}
