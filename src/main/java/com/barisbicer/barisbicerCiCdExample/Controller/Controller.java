package com.barisbicer.barisbicerCiCdExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/example")
    public String example(){
        return  "Spring Boot Uygulamasını AWS EC2 Linux Sunucusuna Jenkins ve Tomcat ile Otomatik Build ve Deploy Yapmak..";

    }

}
