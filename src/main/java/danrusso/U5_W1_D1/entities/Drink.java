package danrusso.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink {
    private String name;
    private int calories;
    private double price;

    public Drink(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", calories = " + calories +
                ", price = " + price + "$";
    }
}
