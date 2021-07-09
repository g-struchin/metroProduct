package com.example.metroproduct;

import com.example.metroproduct.consumingrest.openweathermap.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@SpringBootApplication
public class MetroProductApplication {
    private static final Logger log = LoggerFactory.getLogger(MetroProductApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MetroProductApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    /*
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            RequestQuote requestQuote = restTemplate.getForObject( "https://api.metro-cc.ru/api/v1/C98BB1B547ECCC17D8AEBEC7116D6/10/products?slug=perec-chili-113141", RequestQuote.class);
            //log.info(requestQuote.isSuccess());
            if (requestQuote.getData().getData().isEmpty())
                log.info("request.data.data = empty");
            else {
                log.info(requestQuote.getData().getData().get(0).getName());
            }
        };
    }
    */
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {


            //for (int i = 0; i < requestQuoteOWM.getList().size(); i++)
                //.info(i+" - "+ requestQuoteOWM.getList().get(i).getTemp().getDay());
        };
    }
}
