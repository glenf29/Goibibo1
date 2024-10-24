package com.example.goibibo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Hotelcontroller {

    @RestController
    public class MyController {

        @GetMapping("/hotel")
        public String handleRequest() {
            return "Hello World!";
        }
    }

}




