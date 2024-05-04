import java.util.List;

// Director
public class PizzaDirector {
    public Pizza constructPizza(String chain, String size, List<String> toppings) {
        PizzaBuilder builder = new ConcretePizzaBuilder(chain);
        builder.setSize(size);
        builder.addToppings(toppings);
        return builder.build();
    }
}
