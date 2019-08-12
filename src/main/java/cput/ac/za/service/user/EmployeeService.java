package cput.ac.za.service.user;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.service.service;

import java.util.Set;

public interface EmployeeService extends service<Employee, Integer> {
    Set<Employee> getAll();
}
