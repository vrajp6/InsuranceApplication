package com.example.insuranceapp.service;

import com.example.insuranceapp.model.Quote;
import com.example.insuranceapp.model.User;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    public Quote calculateQuote(User user) {
        double basePremium = 100.0;
        double ageFactor = user.getAge() > 50 ? 1.5 : 1.0;
        double smokerFactor = user.isSmoker() ? 2.0 : 1.0;

        double premium = basePremium * ageFactor * smokerFactor;
        String coverageDetails = "Standard coverage";

        return new Quote(premium, coverageDetails);
    }
}
