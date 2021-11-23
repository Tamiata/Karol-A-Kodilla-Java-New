package com.kodilla.patterns.builder.bigmac;

public class Ingredients {

    public static final String SALAD = "SALAD";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILI = "CHILI";
    public static final String MUSHROOM = "MUSHROOM";
    private final String ingredients;

    public Ingredients(String ingredients) {
        if (ingredients.equals(SALAD) || ingredients.equals(ONION) || ingredients.equals(BACON) || ingredients.equals(CUCUMBER) || ingredients.equals(CHILI) || ingredients.equals(MUSHROOM)) {
            this.ingredients = ingredients;
        } else {
            throw new IllegalStateException("No ingredients chosen");
        }
    }
}