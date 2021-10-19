package com.github.laisefrance.citiesapi.countries.repository;

import com.github.laisefrance.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
