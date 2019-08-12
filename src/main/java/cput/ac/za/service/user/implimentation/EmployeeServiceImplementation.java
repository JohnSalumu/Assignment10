package cput.ac.za.service.user.implimentation;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.repository.user.EmployeeRepository;
import cput.ac.za.repository.user.implimentation.EmployeeRepositoryImplementation;
import cput.ac.za.service.user.EmployeeService;

import java.util.Set;

public class EmployeeServiceImplementation implements EmployeeService {
    private static EmployeeServiceImplementation service = null;
    private EmployeeRepository repository;

    public EmployeeServiceImplementation() {
        repository = EmployeeRepositoryImplementation.getEmployeeRepository();
    }

    public static EmployeeServiceImplementation getService(){

        if(service == null){
            return new EmployeeServiceImplementation();
        }
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return repository.create(employee);
    }

    @Override
    public Employee read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
