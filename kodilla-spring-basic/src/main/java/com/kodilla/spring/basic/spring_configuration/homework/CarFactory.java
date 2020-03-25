package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarFactory {

    @Bean
    @Scope(value = "prototype")
    public Car returnCar(String season) {
        Car car;
        if(season.equals("winter")){
            car = new SUV();
        } else if(season.equals("summer")) {
            car = new Cabrio();
        } else if(season.equals("spring") || (season.equals("autumn"))) {
            car = new Sedan();
        } else
            car = null;

        return car;
    }
}
