package cput.ac.za.service.demography.implimentation;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.repository.demography.GenderRepository;
import cput.ac.za.repository.demography.implementation.GenderRepositoryImplementation;
import cput.ac.za.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImplementation implements GenderService {
    private static GenderServiceImplementation service = null;
    private GenderRepository repository;

    public GenderServiceImplementation() {
        repository = GenderRepositoryImplementation.getGenderRepository();
    }

    public static GenderServiceImplementation getService(){

        if(service == null){
            return new GenderServiceImplementation();
        }
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return repository.create(gender);
    }

    @Override
    public Gender read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Gender update(Gender gender) {
        return repository.update(gender);
    }

    @Override
    public void delete(Integer integer) {
        repository.delete(integer);
    }
}
