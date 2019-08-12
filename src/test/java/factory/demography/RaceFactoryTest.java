package factory.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.domain.demography.Race;
import cput.ac.za.factory.demography.GenderFactory;
import cput.ac.za.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {
    @Test
    public void buildRace() {

        Race race = RaceFactory.buildRace(1, "Coloured");
        Assert.assertNotNull(race);

        System.out.println(race.toString());


    }
}
