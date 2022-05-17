package com.example.purchaseEmulator.Emul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
@RequestMapping("/payment")
public class Emulator
{
    private double probability= 0.75;
    Random random = new Random();

    public String paymentStatus()
    {
        if (random.nextDouble() <= probability)
            return "PURCHASED";
        else
            return "CANCELED";
    }

    @GetMapping
    public String messagePayment()
    {
        return paymentStatus();
    }
}
