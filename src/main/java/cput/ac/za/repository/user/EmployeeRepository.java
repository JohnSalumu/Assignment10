package cput.ac.za.repository.user;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.domain.user.EmployeeGender;
import cput.ac.za.repository.repository;

import java.util.Set;

public interface EmployeeRepository extends repository<Employee, Integer> {

    Set<Employee> getAll();
}
