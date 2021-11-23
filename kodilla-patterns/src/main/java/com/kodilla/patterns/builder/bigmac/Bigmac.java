package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private List<Ingredients> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public Bigmac.BigMacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public Bigmac.BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public Bigmac.BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public Bigmac.BigMacBuilder ingredient(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final Bun bun, int burgers, final Sauce sauce, List<Ingredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers(){
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}



//Utwórz klasę Bigmac, zawierającą następujące pola:
//
//    bun (pol. bułka do hamburgera – w odróżnieniu od roll – zwykłej bułki – może być z sezamem lub bez),
//    burgers – oznaczającą ilość kotletów wołowych w środku kanapki,
//    sauce – oznaczającą rodzaj użytego sosu (standard, 1000 wysp, barbecue), ingredients – oznaczającą listę
//    składników dodatkowych (możliwe wartości to: sałata, cebula, bekon, ogórek, papryczki chilli, pieczarki,
//    krewetki, ser).

//Stwórz wewnętrzną klasę BigmacBuilder zgodną ze wzorcem "Builder".