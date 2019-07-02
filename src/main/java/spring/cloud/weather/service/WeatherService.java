package spring.cloud.weather.service;

import org.springframework.stereotype.Service;
import spring.cloud.weather.vo.WeatherResponse;

@Service
public class WeatherService implements IWeatherService {

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        WeatherResponse res = new WeatherResponse();
        res.setDesc("suny");
        return res;
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        WeatherResponse res = new WeatherResponse();
        res.setDesc("rumy");
        return res;
    }
}
