package oop.weatherreport;

public class Weather {
    private String description;
    private int temp;

    public Weather(String description, int temp) {
        this.description = description;
        this.temp = temp;
    }

    public String getDescription() {
        return description;
    }
}
