package com.chafy.learn.backend.DAO;

public class CityMain {
    public static void main(String[] args) {
        CityDAO cityDAO = new CityDAOImpl();

        for (City cityName : cityDAO.getAllCity()) {
            System.out.println("city: " + cityName.getName() + " | " + "country : " + cityName.getCountry());
        }
        System.out.println();

        City city = cityDAO.getAllCity().get(1);
        city.setName("Paris");
        city.setCountry("France");

        System.out.println();
        for (City cityName : cityDAO.getAllCity()) {
            System.out.println("city: " + cityName.getName() + " | " + "country : " + cityName.getCountry());
        }

        System.out.println();
        System.out.println("removed data : ");
        System.out.println(cityDAO.getCity(1).getName());

        cityDAO.removeCity(city);
        for (City cityName : cityDAO.getAllCity()) {
            System.out.println("city: " + cityName.getName() + " | " + "country : " + cityName.getCountry());
        }

        System.out.println();
        cityDAO.saveCity(city);
        for (City cityName : cityDAO.getAllCity()) {
            System.out.println("city: " + cityName.getName() + " | " + "country : " + cityName.getCountry());
        }
    }
}
