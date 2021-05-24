package com.example.bookingService.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "booking")
public class BookingProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private Long productId;
    @Column(nullable = false)
    private Long price;
    @Column(nullable = false)
    private boolean status;

}
