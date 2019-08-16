package com.example.usecase3;

public class ContentItemViewModel {

    private static final String AMAZON = "Amazon";
    private static final String NETFLIX = "Netflix";
    private static final String HOTSTAR = "Hotstar";
    private static final String ZEE5 = "Zee5";

    private String title;
    private String language;
    private int category;
    private String platFormName;
    private int logo;
    private boolean isLoggedIn;
    private boolean isPrime;
    private double subscriptionFee;

    public ContentItemViewModel(String title, String language, int category, String platFormName, int logo, boolean isLoggedIn, boolean isPrime, double subscriptionFee) {
        this.title = title;
        this.language = language;
        this.category = category;
        this.platFormName = platFormName;
        this.logo = logo;
        this.isLoggedIn = isLoggedIn;
        this.isPrime = isPrime;
        this.subscriptionFee = subscriptionFee;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public int getCategory() {
        return category;
    }

    public String getPlatFormName() {
        return platFormName;
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

    public boolean showLogo() {
        if (getPlatFormName().equals(AMAZON) || getPlatFormName().equals(NETFLIX) || getPlatFormName().equals(ZEE5))
            return true;
        else
            return isPrime;
    }

    public boolean showLoginStatus() {
        if (getPlatFormName().equals(AMAZON) || getPlatFormName().equals(NETFLIX))
            return true;
        else
            return false;
    }

    public boolean showPrimeDetails() {
        if (getPlatFormName().equals(ZEE5))
            return true;
        else
            return false;
    }

    public boolean showSubscriptionFee() {
        if (getPlatFormName().equals(ZEE5))
            return true;
        else
            return false;
    }
}
