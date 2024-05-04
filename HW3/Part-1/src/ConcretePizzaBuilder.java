import java.util.ArrayList;
import java.util.List;

// Builder Class
public class ConcretePizzaBuilder implements PizzaBuilder {
    private String chain;
    private String size;
    private List<String> toppings;

    public ConcretePizzaBuilder(String chain) {
        this.chain = chain;
        toppings = new ArrayList<>();
    }

    @Override
    public Pizza build() {
        return new Pizza(chain, size, toppings);
    }

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder addToppings(List<String> toppings) {
        this.toppings.addAll(toppings);
        return this;
    }
}
