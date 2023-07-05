package com.example.reciper;

public class cheeseBurger {
    String burgerName;
    String burgerAbbreviation;
    String burgerAbbreviationSmall;
    int image;

    public cheeseBurger(String burgerName, String burgerAbbreviation, String burgerAbbreviationSmall, int image) {
        this.burgerName = burgerName;
        this.burgerAbbreviation = burgerAbbreviation;
        this.burgerAbbreviationSmall = burgerAbbreviationSmall;
        this.image = image;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getBurgerAbbreviation() {
        return burgerAbbreviation;
    }

    public String getBurgerAbbreviationSmall() {
        return burgerAbbreviationSmall;
    }

    public int getImage() {
        return image;
    }
}
