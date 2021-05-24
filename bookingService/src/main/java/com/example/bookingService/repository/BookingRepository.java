package com.example.bookingService.repository;

import com.example.bookingService.model.BookingProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingProduct, Long> {
}
