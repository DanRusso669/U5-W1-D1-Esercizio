package danrusso.U5_W1_D1;


import danrusso.U5_W1_D1.entities.Drink;
import danrusso.U5_W1_D1.entities.Menu;
import danrusso.U5_W1_D1.entities.Pizza;
import danrusso.U5_W1_D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    // ***************************** PIZZA ***************************************

    @Bean
    public Pizza getMargherita() {
        return new Pizza("Margherita", "tomato, mozzarella cheese", 1200, 7.99);
    }

    @Bean
    public Pizza getCapricciosa() {
        return new Pizza("4 Stagioni", "tomato, mozzarella cheese, olives, ham, mushrooms, artichoke", 1270, 8.50);
    }

    @Bean
    public Pizza getSalsicciaFriarielli() {
        return new Pizza("Salsiccia e Friarielli", "tomato, mozzarella cheese, sausage, friarielli", 1355, 8.50);
    }

    @Bean
    public Pizza getTonnoGorgo() {
        return new Pizza("Tonno e Gorgonzola", "tomato, mozzarella cheese, gorgonzola cheese, tuna", 1800, 10.50);
    }

    @Bean
    public List<Pizza> getAllPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(getMargherita());
        pizzas.add(getCapricciosa());
        pizzas.add(getSalsicciaFriarielli());
        pizzas.add(getTonnoGorgo());
        return pizzas;
    }

    // ***************************** TOPPINGS **********************************

    @Bean
    public Topping getTuna() {
        return new Topping("Tuna", 180, 1);
    }

    @Bean
    public Topping getBufala() {
        return new Topping("Bufala", 230, 3);
    }

    @Bean
    public Topping getOnion() {
        return new Topping("Onion", 20, 1);
    }

    @Bean
    public Topping getSalami() {
        return new Topping("Salami", 150, 1.50);
    }

    @Bean
    public Topping getHam() {
        return new Topping("Ham", 390, 1.50);
    }

    @Bean
    public List<Topping> getAllToppings() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getHam());
        toppings.add(getBufala());
        toppings.add(getOnion());
        toppings.add(getTuna());
        toppings.add(getSalami());
        return toppings;
    }

    // ***************************** DRINKS **********************************

    @Bean
    public Drink getCola() {
        return new Drink("Coca Cola", 209, 2.50);
    }

    @Bean
    public Drink getSprite() {
        return new Drink("Sprite", 229, 2.50);
    }

    @Bean
    public Drink getFanta() {
        return new Drink("Fanta", 219, 2.50);
    }

    @Bean
    public Drink getWater() {
        return new Drink("Still/Sparkling Water", 19, 1);
    }

    @Bean
    public Drink getBeer() {
        return new Drink("Beer", 357, 5);
    }

    @Bean
    public List<Drink> getAllDrinks() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(getBeer());
        drinks.add(getSprite());
        drinks.add(getCola());
        drinks.add(getWater());
        drinks.add(getFanta());
        return drinks;
    }

    @Bean
    public Menu getMenu() {
        return new Menu(getAllPizzas(), getAllToppings(), getAllDrinks());
    }


}
