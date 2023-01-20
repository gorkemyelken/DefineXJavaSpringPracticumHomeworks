package definexjavaspringpracticum.weatherapi.controllers;

import definexjavaspringpracticum.weatherapi.models.CurrentWeather;
import definexjavaspringpracticum.weatherapi.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WeatherController {
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String get(Model model){
        CurrentWeather data = weatherService.getWeather();
        model.addAttribute("data",data);
        return "index";
    }
}
