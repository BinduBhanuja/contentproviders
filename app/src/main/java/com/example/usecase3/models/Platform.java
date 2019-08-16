package com.example.usecase3.models;

public class Platform {

    private String platFormName;
    private int logo;
    private boolean isLoggedIn;
    private boolean isPrime;
    private double subscriptionFee;

    public int getLogo() {
        return logo;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public void setSubscriptionFee(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public String getPlatFormName() {
        return platFormName;
    }

    public void setPlatFormName(String platFormName) {
        this.platFormName = platFormName;
    }

}
