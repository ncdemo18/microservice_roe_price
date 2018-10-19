package ru.rakh.microservice_roe_price;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    @RequestMapping("/")
    String index (){
        return "300.0";
    }

}
