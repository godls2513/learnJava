package com.chafy.learn.backend.DAO;

import java.util.ArrayList;
import java.util.List;

public class CityDAOImpl implements CityDAO {
    private List<City> cityList = new ArrayList<>();
    ;

    public CityDAOImpl() {
        cityList.add(new City("Seoul", "Korea"));
        cityList.add(new City("Tokyo", "japan"));
        cityList.add(new City("London", "UK"));
        cityList.add(new City("New York", "USA"));
    }


    @Override
    public List<City> getAllCity() {
        return cityList;
    }

    @Override
    public City getCity(int index) {
        return cityList.get(index);
    }


    @Override
    public void saveCity(City city) {
        cityList.add(city);
    }

    @Override
    public void removeCity(City city) {
        cityList.remove(city);
    }
}
