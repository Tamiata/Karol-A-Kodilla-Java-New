package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "STANDARD";
    public static final String THOUSANDISLANDS = "THOUSANDISLANDS";
    public static final String BARBECUE = "BARBECUE";
    private final String sauce;

    public Sauce(String sauce) {
        if (sauce.equals(STANDARD) || sauce.equals(THOUSANDISLANDS) || sauce.equals(BARBECUE)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("Sauce not chosen!");
        }
    }

    @Override
    public String toString() {
        return sauce;
    }
}