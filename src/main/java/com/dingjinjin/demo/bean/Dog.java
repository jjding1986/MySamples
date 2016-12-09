package com.dingjinjin.demo.bean;

public class Dog {
    private String name;
    private Food food;
    private Country country;

    public Dog() {}

    public Dog(String name) {
        this.name = name;
        food = new Food();
        food.setName("骨头");
        country = new Country();
        country.setName("中国");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
