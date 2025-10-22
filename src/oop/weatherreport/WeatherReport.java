package oop.weatherreport;
// Skapa en klass WeatherReport:
//Konstruktorn ska ta in temperatur och
// beskrivning (t.ex. "soligt", "regnigt").
//Skapa en metod getDescription som returnerar en beskrivning av vädret.
//Skapa ett WeatherReport-objekt i main och skriv ut väderbeskrivningen.
public class WeatherReport {
    public static void main(String[] args) {
        Weather myWeather = new Weather("soligt", 30);
        System.out.println("Vädret idag är "+myWeather.getDescription());
    }
}
