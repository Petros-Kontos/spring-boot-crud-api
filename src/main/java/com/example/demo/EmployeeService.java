package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeDAO employeeDao;

    public EmployeeService(EmployeeDAO employeeDao) {

        this.employeeDao = employeeDao;
    }

    @Transactional
    public List<Employee> findAll() {

        return employeeDao.findAll();
    }

    @Transactional
    public Employee findById(int theId) {
        return employeeDao.findById(theId);
    }

    @Transactional
    public void save(Employee theEmployee) {

        employeeDao.save(theEmployee);
    }

    @Transactional
    public void deleteById(int theId) {
        employeeDao.deleteById(theId);
    }
}
