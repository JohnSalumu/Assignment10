package cput.ac.za.repository.user;

import cput.ac.za.domain.user.EmployeeGender;
import cput.ac.za.repository.repository;

import java.util.Set;

public interface EmployeeGenderRepository  extends repository {
    Set<EmployeeGender> getAll();
}
