package homework_nr_4;

public class TemperatureConverter {

    public double toCelsius (int fahrenheit){
        double celsius;
        celsius = (fahrenheit - 32) * 5.0/9.0;
        return celsius;
    }

    public double toFahrenheit (int celsius){
        double fahrenheit;
        fahrenheit = celsius * 9.0/5.0 + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {

        TemperatureConverter converter = new TemperatureConverter();

        int fahrenheit1 = 32;
        int fahrenheit2 = 212;
        System.out.println(fahrenheit1 + "°F = " + converter.toCelsius(fahrenheit1) + "°C");
        System.out.println(fahrenheit2 + "°F = " + converter.toCelsius(fahrenheit2) + "°C");

        int celsius1 = 0;
        int celsius2 = 100;
        System.out.println(celsius1 + "°C = " + converter.toFahrenheit(celsius1) + "°F");
        System.out.println(celsius2 + "°C = " + converter.toFahrenheit(celsius2) + "°F");

    }
}