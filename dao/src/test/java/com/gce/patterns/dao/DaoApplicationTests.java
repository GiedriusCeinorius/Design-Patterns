package com.gce.patterns.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoApplicationTests {

    @Autowired
    EmployeeDAO dao;

    @Test
    public void testCreate() {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John");
        dao.create(emp);
    }

}

