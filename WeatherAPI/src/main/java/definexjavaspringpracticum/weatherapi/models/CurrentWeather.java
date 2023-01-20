package definexjavaspringpracticum.weatherapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather {
    private List<Weather> weather;
    private Main main;
    private Sys sys;

    private static class Main {
        private float temp;
        private float feels_like;
        private float temp_min;
        private float temp_max;
        private int pressure;

        public float getTemp() {
            return Math.round(temp-273.15);
        }

        public float getFeels_like() {
            return Math.round(feels_like-273.15);
        }

        public float getTemp_min() {
            return Math.round(temp_min-273.15);
        }

        public float getTemp_max() {
            return Math.round(temp_max-273.15);
        }

        public int getPressure() {
            return pressure;
        }
    }

    @Getter
    private static class Sys {
        private  String country;
    }

    @Getter
    private static class Weather {
        private String main;
        private String description;
    }

}
