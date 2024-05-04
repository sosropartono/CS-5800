import java.util.List;

// Product class
public class Pizza {
    private String chain;
    private String size;
    private List<String> toppings;

    public Pizza(String chain, String size, List<String> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Eating pizza from " + chain + " - Size: " + size + ", Toppings: " + toppings);
    }
}
