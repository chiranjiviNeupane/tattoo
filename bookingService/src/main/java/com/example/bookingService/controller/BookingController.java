package com.example.bookingService.controller;

import com.example.bookingService.model.BookingProduct;
import com.example.bookingService.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookingProducts")
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    @GetMapping("")
    public List<BookingProduct> allProducts() {
        return bookingService.findAllBookings();
    }

}
