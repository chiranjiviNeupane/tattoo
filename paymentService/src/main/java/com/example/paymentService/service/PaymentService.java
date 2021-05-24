package com.example.paymentService.service;

import com.example.paymentService.model.Payment;
import com.example.paymentService.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository){
        this.paymentRepository=paymentRepository;
    }
    public List<Payment> findAllPayments() {
        return paymentRepository.findAll();
    }
}
