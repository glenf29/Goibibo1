package com.example.Goibibo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
class HotelController {

    @GetMapping("/hotel")
    public String getData() {
        return "Please book hotel from MMT, 25% discount in North India";
    }


    @PutMapping("/hotel/{hotelId}")
    public String updateHotel(@PathVariable String hotelId, @RequestParam String status) {
        return "Hotel with ID: " + hotelId + " is now " + status;
    }
}