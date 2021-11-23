package com.kodilla.patterns.builder.bigmac;

public class Bun {

    public static final String CLASSIC = "CLASSIC";
    public static final String SESAME = "SESAME";
    private final String bunType;

    public Bun(String bunType) {
        if (bunType.equals(CLASSIC) || bunType.equals(SESAME)) {
            this.bunType = bunType;
        } else {
            throw new IllegalStateException("Bun type not chosen!");
        }
    }
}
