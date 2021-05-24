package com.example.bookingService.service;

import com.example.bookingService.model.BookingProduct;
import com.example.bookingService.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<BookingProduct> findAllBookings() {
        return bookingRepository.findAll();
    }


}
