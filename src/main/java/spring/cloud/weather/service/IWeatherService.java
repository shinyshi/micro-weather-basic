package spring.cloud.weather.service;

import spring.cloud.weather.vo.WeatherResponse;

public interface IWeatherService {

    WeatherResponse getDataByCityId(String cityId);
    WeatherResponse getDataByCityName(String cityName);
}
