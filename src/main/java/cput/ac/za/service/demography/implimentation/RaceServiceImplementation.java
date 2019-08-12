package cput.ac.za.service.demography.implimentation;

import cput.ac.za.domain.demography.Race;
import cput.ac.za.repository.demography.RaceRepository;
import cput.ac.za.repository.demography.implementation.RaceRepositoryImplementation;
import cput.ac.za.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImplementation implements RaceService {
    private static RaceServiceImplementation service = null;
    private RaceRepository repository;

    public RaceServiceImplementation() {
        repository = RaceRepositoryImplementation.getRaceRepository();
    }

    public static RaceServiceImplementation getService(){

        if(service == null){
            return new RaceServiceImplementation();
        }
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public void delete(Integer integer) {
        repository.delete(integer);
    }
}
