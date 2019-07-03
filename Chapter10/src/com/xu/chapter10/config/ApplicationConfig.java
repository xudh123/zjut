package com.xu.chapter10.config;

import com.xu.chapter10.pojo.Role;
import com.xu.chapter10.service.Impl.RoleServiceimpl;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {Role.class, RoleServiceimpl.class})
public class ApplicationConfig {
}
