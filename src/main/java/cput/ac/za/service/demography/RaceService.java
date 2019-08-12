package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.domain.demography.Race;
import cput.ac.za.service.service;

import java.util.Set;

public interface RaceService extends service<Race, Integer> {
    Set<Race> getAll();

}
