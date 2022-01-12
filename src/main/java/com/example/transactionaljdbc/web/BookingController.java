package com.example.transactionaljdbc.web;

import com.example.transactionaljdbc.entities.Booking;
import com.example.transactionaljdbc.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @GetMapping("/list")
    public List<Booking> getList(){
        return bookingService.book();
    }
}
