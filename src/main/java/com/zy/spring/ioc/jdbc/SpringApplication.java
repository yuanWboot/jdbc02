package com.zy.spring.ioc.jdbc;

import com.zy.spring.ioc.jdbc.dao.EmployeeDao;
import com.zy.spring.ioc.jdbc.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
        Employee employee = employeeDao.findById(3308);
        System.out.println(employee);
    }
}
