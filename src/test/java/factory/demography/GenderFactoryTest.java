package factory.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {
    @Test
    public void getGender() {

        Gender gender = GenderFactory.buildGender(1, "Male");
        Assert.assertNotNull(gender);

        System.out.println(gender.toString());
    }
}
