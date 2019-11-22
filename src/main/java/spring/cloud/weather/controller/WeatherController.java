package spring.cloud.weather.controller;

import javafx.print.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.weather.service.IWeatherService;
import spring.cloud.weather.vo.WeatherResponse;

import java.util.logging.Logger;


@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private IWeatherService weatherService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getReportByCityId(@PathVariable("cityId") String cityId)
    {
        System.out.print("收到请求获取天气信息");
        WeatherResponse res=weatherService.getDataByCityId(cityId);
        res.setDesc(cityId);
        return res;
    }
}
