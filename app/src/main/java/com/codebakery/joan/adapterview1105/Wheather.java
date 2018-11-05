package com.codebakery.joan.adapterview1105;

public class Wheather {
    private String city,temp,wheather;

    public Wheather(String city, String temp, String wheather) {
        this.city = city;
        this.temp = temp;
        this.wheather = wheather;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWheather() {
        return wheather;
    }

    public void setWheather(String wheather) {
        this.wheather = wheather;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Wheather{");
        sb.append("city='").append(city).append('\'');
        sb.append(", temp='").append(temp).append('\'');
        sb.append(", wheather='").append(wheather).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
