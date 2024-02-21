package com.chafy.learn.backend.DAO;

import java.util.List;

public interface CityDAO {

    List<City> getAllCity();

    City getCity(int index);

    void saveCity(City city);

    void removeCity(City city);

}
