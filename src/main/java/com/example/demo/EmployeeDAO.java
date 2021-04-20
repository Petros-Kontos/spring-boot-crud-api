package com.example.demo;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public List<Employee> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

        return theQuery.getResultList();
    }

    public Employee findById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);

        return currentSession.get(Employee.class, theId);
    }

    public void save(Employee theEmployee) {

        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(theEmployee);
    }

    public void deleteById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from Employee where id=:employeeId");

        theQuery.setParameter("employeeId", theId);

        theQuery.executeUpdate();
    }
}
