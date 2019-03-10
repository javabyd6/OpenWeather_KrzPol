import Service.Weather;
import Service.WeatherService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class main
{
    public static void main(String[] args) throws MalformedURLException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Użytkowniku, podaj nazwe miasta którego chcesz sprawdzić pogode");
        String city = scanner.nextLine();
        Weather pogoda = WeatherService.getCityWeather(city);
        double temp = pogoda.getTemp();
        System.out.println("Pogoda dla "+ city+" tutaj "+temp+" stopni celsjusza");

    }
}
