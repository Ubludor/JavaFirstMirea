package ru.mirea.task27;

public class City {
    String city;
    String country;

    public City(String city, String country)
    {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
