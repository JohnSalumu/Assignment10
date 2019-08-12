package factory.user;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {

        Employee emp = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");
        Assert.assertNotNull(emp);
        System.out.println(emp.toString());
    }
}
