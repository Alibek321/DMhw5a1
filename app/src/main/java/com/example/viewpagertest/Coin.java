package com.example.viewpagertest;

public class Coin {
    private int image;
    private String label;
    private String currency;

    public Coin(int image, String label, String currency) {
        this.image = image;
        this.label = label;
        this.currency = currency;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
