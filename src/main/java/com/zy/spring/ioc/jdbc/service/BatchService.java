package com.zy.spring.ioc.jdbc.service;

import com.zy.spring.ioc.jdbc.dao.EmployeeDao;
import com.zy.spring.ioc.jdbc.entity.Employee;

import java.util.Date;

public class BatchService {
    private EmployeeDao employeeDao;
    public void importJob1(){
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setEno(5000+i);
            employee.setEname("员工"+i);
            employee.setDname("研发部");
            employee.setSalary(6666f);
            employee.setHiredate(new Date());
            employeeDao.insert(employee);
        }
    }
    public void importJob2(){
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setEno(4000+i);
            employee.setEname("市场部员工"+i);
            employee.setDname("市场部");
            employee.setSalary(6666f);
            employee.setHiredate(new Date());
            employeeDao.insert(employee);
        }
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
