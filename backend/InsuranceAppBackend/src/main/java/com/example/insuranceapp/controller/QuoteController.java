package com.example.insuranceapp.controller;

import com.example.insuranceapp.model.Quote;
import com.example.insuranceapp.model.User;
import com.example.insuranceapp.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @PostMapping("/quote")
    public Quote getQuote(@RequestBody User user) {
        return quoteService.calculateQuote(user);
    }
}
