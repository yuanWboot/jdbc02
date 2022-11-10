package com.zy.spring.ioc.jdbc.service;

import com.zy.spring.ioc.jdbc.dao.EmployeeDao;
import com.zy.spring.ioc.jdbc.entity.Employee;


import java.util.Date;

public class EmployeeService {
    private EmployeeDao employeeDao;

    public void batchImport(){
        for (int i = 0; i < 10; i++) {
            if (i==3){
                throw new RuntimeException("意料之外的错误");
            }
            Employee employee = new Employee();
            employee.setEno(8000+i);
            employee.setEname("员工"+i);
            employee.setDname("研发部");
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
