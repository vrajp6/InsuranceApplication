package com.example.insuranceapp.model;

public class Quote {
    private double premium;
    private String coverageDetails;

    // Constructor
    public Quote() {}

    public Quote(double premium, String coverageDetails) {
        this.premium = premium;
        this.coverageDetails = coverageDetails;
    }

    // Getters and Setters
    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public String getCoverageDetails() {
        return coverageDetails;
    }

    public void setCoverageDetails(String coverageDetails) {
        this.coverageDetails = coverageDetails;
    }
}
