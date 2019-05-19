package com.imooc.weatherssss.controller;

import com.imooc.weatherssss.service.WeatherDataService;
import com.imooc.weatherssss.vo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author 周启江
 * @ClassName: WeatherDataController
 * @date 2019/5/19 11:42
 */
@RestController
public class WeatherDataController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/getWeather/{cityId}")
    public Weather getWeather(@PathVariable("cityId")String cityId){
        return weatherDataService.getDataByCityId(cityId);
    }
}
