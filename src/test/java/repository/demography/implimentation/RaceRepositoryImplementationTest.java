package repository.demography.implimentation;

import cput.ac.za.domain.demography.Race;
import cput.ac.za.factory.demography.RaceFactory;
import cput.ac.za.repository.demography.RaceRepository;
import cput.ac.za.repository.demography.implementation.RaceRepositoryImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RaceRepositoryImplementationTest {
    private RaceRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImplementation.getRaceRepository();
    }


    @Test
    public void getAll() {

        Set<Race> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Race employee = RaceFactory.buildRace(1,"Other");

        repository.create(employee);
        Race race = repository.read(employee.getID());
        Assert.assertNotNull(race);

        System.out.println(race.toString());
    }

    @Test
    public void read() {

        Race employee = RaceFactory.buildRace(1,"Other");

        repository.create(employee);
        Race race = repository.read(employee.getID());
        Assert.assertNotNull(race);

        System.out.println(race.toString());
    }

    @Test
    public void update() {

        Race employee = RaceFactory.buildRace(1,"Other");

        repository.create(employee);
        Race race = repository.read(employee.getID());
        employee.setType("Coloured");
        repository.update(employee);
        Assert.assertEquals(employee.getID(), race.getID());

        System.out.println(race.toString());
    }

    @Test
    public void delete() {

        Race employee = RaceFactory.buildRace(1,"Other");

        repository.create(employee);
        Race race = repository.read(employee.getID());
        Assert.assertNotNull(race);
        repository.delete(employee.getID());
        Race deleted = repository.read(employee.getID());
        Assert.assertNull(deleted);

        System.out.println(race.toString());

    }
}
