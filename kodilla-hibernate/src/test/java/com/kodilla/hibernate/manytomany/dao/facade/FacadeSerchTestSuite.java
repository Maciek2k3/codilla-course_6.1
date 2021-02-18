package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SerchFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeSerchTestSuite {
    @Autowired
    private SerchFacade serchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void companyLikeTest() {
        //Given
        Company comp = new Company("Comp");
        Company comp1 = new Company("Comp2");
        companyDao.save(comp);
        companyDao.save(comp1);
        //When
        List<Company> queryListComp = serchFacade.retrieveCompanyNameLike("om");
        //Then
        assertEquals(2, queryListComp.size());

    }

    @Test
    public void employeeyLikeTest() {
        //Given
        Employee empl1 = new Employee("Name", "Name");
        Employee empl2 = new Employee("Name2", "Name2");
        employeeDao.save(empl1);
        employeeDao.save(empl2);
        //When
        List<Employee> queryListEmpl = serchFacade.retrieveEmployeeLike("me");
        //Then
        assertEquals(4, queryListEmpl.size());
    }
}
