package com.example.usecase3.models;

public class ContentProvider {

    private String title;
    private String language;
    private int category;
    private String platFormName;
    private int logo;
    private boolean isLoggedIn;
    private boolean isPrime;
    private double subscriptionFee;

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public int getCategory() {
        return category;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatFormName() {
        return platFormName;
    }

    public void setPlatFormName(String platFormName) {
        this.platFormName = platFormName;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }
}
