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

    private static final String url = "https://api.openweathermap.org/data/2.5/weather?q=";
    private static final String appid = "17170cb6b4206b450874a2daa581ff83";
    private static final String city = "Ankara";
    private static final String language = "en";
    public CurrentWeather getWeather(){
        CurrentWeather data = null;
        try{
            data = restTemplate.getForObject(url + city + "&lang=" + language + "&appid=" + appid, CurrentWeather.class);
        }catch (Exception e){
            System.out.println(e);
        }
        return data;
    }
}
