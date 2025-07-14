package danrusso.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Pizza {
    private String name;
    private String ingredients;
    private int calories;
    private double price;

    public Pizza(String name, String ingredients, int calories, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return name +
                ", ingredients = " + ingredients +
                ", calories = " + calories +
                ", price = " + price +
                "$";
    }
}

