package definexjavaspringpracticum.weatherapi.controllers;

import definexjavaspringpracticum.weatherapi.models.CurrentWeather;
import definexjavaspringpracticum.weatherapi.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class WeatherController {
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public ResponseEntity<CurrentWeather> getWeather(){
        return new ResponseEntity<>(this.weatherService.getWeather(), HttpStatus.OK) ;
    }

    @GetMapping("/get")
    public String get(Model model){
        model.addAttribute("name",this.weatherService.getWeather().getName());
        return "get";
    }
}
