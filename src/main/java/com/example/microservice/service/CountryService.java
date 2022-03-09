package com.example.microservice.service;

import com.example.microservice.DTO.CountriesDTO;
import com.example.microservice.entity.CountriesEntity;
import com.example.microservice.exception.CustomException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {

    String insertNewCountrySP(String Country, String acronym_shop);

    List<CountriesEntity> allCountries();

    List<CountriesDTO> getAllCountriesWithoutJoin();

    String updateCountrySP(Integer id_country, String name_country, String acronym_shop);

    String deleteAndOrderCountryByIdSP(Integer id_country);

    Object findCountryById(Integer id_country) throws CustomException;

    Object findCountryByNameCountry(String name_country) throws CustomException;
}
