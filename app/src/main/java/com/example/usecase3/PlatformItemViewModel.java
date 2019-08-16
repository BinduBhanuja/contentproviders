package com.example.usecase3;

public class PlatformItemViewModel {

    private int logo;
    private boolean isLoggedIn;
    private boolean isPrime;
    private double subscriptionFee;

    public PlatformItemViewModel(int logo, boolean isLoggedIn, boolean isPrime, double subscriptionFee) {
        this.logo = logo;
        this.isLoggedIn = isLoggedIn;
        this.isPrime = isPrime;
        this.subscriptionFee = subscriptionFee;
    }

    public int getLogo() {
        return logo;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public String getSubscriptionFee() {
        return String.valueOf(subscriptionFee);
    }
}
