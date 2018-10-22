package ru.rakh.microservice_roe_price;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rakh.microservice_roe_price.model.PriceClass;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
public class UrlController {

    @RequestMapping("/")
    List<PriceClass> index (){
        return Collections.singletonList(new PriceClass(100L,0L,200L,90L,new Date()));
    }

}
