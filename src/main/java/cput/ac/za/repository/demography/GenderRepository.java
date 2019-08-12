package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.repository.repository;

import java.util.Set;

public interface GenderRepository extends repository<Gender, Integer> {
    Set<Gender> getAll();

}
