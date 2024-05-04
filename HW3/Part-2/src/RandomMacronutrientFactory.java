import java.util.List;
import java.util.Random;

// Concrete Factory
public class RandomMacronutrientFactory implements MacronutrientFactory {
    private static RandomMacronutrientFactory instance;
    private Random random;

    private RandomMacronutrientFactory() {
        random = new Random();
    }

    public static synchronized RandomMacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new RandomMacronutrientFactory();
        }
        return instance;
    }

    @Override
    public Macronutrient createCarbs() {
        List<String> carbOptions = List.of("Cheese", "Bread", "Lentils", "Pistachio");
        return new Carbs(carbOptions.get(random.nextInt(carbOptions.size())));
    }

    @Override
    public Macronutrient createProtein() {
        List<String> proteinOptions = List.of("Fish", "Chicken", "Beef", "Tofu");
        return new Protein(proteinOptions.get(random.nextInt(proteinOptions.size())));
    }

    @Override
    public Macronutrient createFats() {
        List<String> fatOptions = List.of("Avocado", "Sour cream", "Tuna", "Peanuts");
        return new Fats(fatOptions.get(random.nextInt(fatOptions.size())));
    }
}
