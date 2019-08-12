package service.user.implimentation;

import cput.ac.za.domain.user.EmployeeGender;
import cput.ac.za.factory.user.EmployeeGenderFactory;
import cput.ac.za.service.user.EmployeeGenderService;
import cput.ac.za.service.user.implimentation.EmployeeGenderServiceImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class EmployeeGenderServiceImplementationTest {
    private EmployeeGenderService service;

    @Before
    public void setUp() throws Exception {
        this.service = EmployeeGenderServiceImplementation.getService();
    }

    @Test
    public void getAll() {

        Set<EmployeeGender> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        service.create(employee);
        EmployeeGender empGender = service.read(employee.getEmpNo());
        Assert.assertNotNull(empGender);

        System.out.println(empGender.toString());
    }

    @Test
    public void read() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        service.create(employee);
        EmployeeGender empGender = service.read(employee.getEmpNo());
        Assert.assertNotNull(empGender);

        System.out.println(empGender.toString());
    }

    @Test
    public void update() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        service.create(employee);
        EmployeeGender empGender = service.read(employee.getEmpNo());
        employee.setEmpNo(9);
        service.update(employee);
        Assert.assertEquals(employee.getEmpNo(), empGender.getEmpNo());

        System.out.println(empGender.toString());
    }

    @Test
    public void delete() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        service.create(employee);
        EmployeeGender empGender = service.read(employee.getEmpNo());
        Assert.assertNotNull(empGender);
        service.delete(employee.getEmpNo());
        EmployeeGender deleted = service.read(employee.getEmpNo());
        Assert.assertNull(deleted);

        System.out.println(empGender.toString());
    }
}
