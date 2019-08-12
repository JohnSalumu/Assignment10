package cput.ac.za.service.user;

import cput.ac.za.domain.user.EmployeeGender;
import cput.ac.za.service.service;

import java.util.Set;

public interface EmployeeGenderService extends service<EmployeeGender, Integer> {
    Set<EmployeeGender> getAll();
}
