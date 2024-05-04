// Concrete Carbs
public class Carbs implements Macronutrient {
    private String name;

    public Carbs(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
