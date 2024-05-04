import java.util.ArrayList;
import java.util.List;

// Abstract Builder
interface PizzaBuilder {
    Pizza build();
    PizzaBuilder setSize(String size);
    PizzaBuilder addToppings(List<String> toppings);
}

// Client
public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        // Pizza Hut
        Pizza pizza1 = director.constructPizza("Pizza Hut", "Small", List.of("Pepperoni", "Mushrooms", "Onions"));
        Pizza pizza2 = director.constructPizza("Pizza Hut", "Medium", List.of("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese"));
        Pizza pizza3 = director.constructPizza("Pizza Hut", "Large", List.of("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil", "Beef", "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple"));
        // Eatin Pizza Hut pizzas!
        pizza1.eat();
        pizza2.eat();
        pizza3.eat();
        // Little Caesars
        Pizza pizza4 = director.constructPizza("Little Caesars", "Large", List.of("Pepperoni", "Mushrooms", "Onions"));
        Pizza pizza5 = director.constructPizza("Little Caesars", "Medium", List.of("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese", "Peppers", "Chicken"));
        Pizza pizza6 = director.constructPizza("Little Caesars", "Small", List.of("Pepperoni"));
        // Eatin Little Caesars pizzas!
        pizza4.eat();
        pizza5.eat();
        pizza6.eat();
        // Dominos
        Pizza pizza7 = director.constructPizza("Dominos", "Small", List.of("Pepperoni", "Mushrooms"));
        Pizza pizza8 = director.constructPizza("Dominos", "Small", List.of("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese"));
        Pizza pizza9 = director.constructPizza("Dominos", "Large", List.of("Pepperoni", "Sausage", "Mushrooms"));
        // Eat Dominos pizzas
        pizza7.eat();
        pizza8.eat();
        pizza9.eat();
    }
}
