package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.service.service;

import java.util.Set;

public interface GenderService  extends service<Gender, Integer> {
    Set<Gender> getAll();
}
