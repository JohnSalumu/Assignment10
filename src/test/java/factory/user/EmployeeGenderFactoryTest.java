package factory.user;

import cput.ac.za.domain.user.EmployeeGender;
import cput.ac.za.factory.user.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeGenderFactoryTest {
    @Test
    public void buildEmployeeGender() {
        EmployeeGender empGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
        Assert.assertNotNull(empGender);
        System.out.println(empGender);
    }
}
