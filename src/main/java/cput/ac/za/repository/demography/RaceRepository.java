package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Race;
import cput.ac.za.repository.repository;

import java.util.Set;

public interface RaceRepository  extends repository<Race, Integer> {
    Set<Race> getAll();
}
