package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Bigmac {
    private String bun;
    int burgers;
    private String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class burgersBuilder {
        private String bun;
        int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public burgersBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public burgersBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public burgersBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public burgersBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bigmac(final String bun, final int burgers, final String sauce, final String... ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
