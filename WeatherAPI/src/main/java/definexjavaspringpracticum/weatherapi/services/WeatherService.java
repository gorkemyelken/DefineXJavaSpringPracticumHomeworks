package definexjavaspringpracticum.weatherapi.services;

import definexjavaspringpracticum.weatherapi.models.CurrentWeather;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    private static final String url = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=17170cb6b4206b450874a2daa581ff83";
    private static String lang = "en";
    private static String unit = "metric";

    public CurrentWeather getWeather(){
        CurrentWeather data = new CurrentWeather();
        data = restTemplate.getForObject(url, CurrentWeather.class);
        return data;
    }
}
