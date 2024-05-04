// Customer class
public class Customer {
    private String name;
    private String dietPlan;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public void generateMeal() {
        MacronutrientFactory factory = RandomMacronutrientFactory.getInstance();
        Macronutrient carbs = factory.createCarbs();
        Macronutrient protein = factory.createProtein();
        Macronutrient fats = factory.createFats();

        System.out.println("Meal for " + name + " (Diet Plan: " + dietPlan + "):");
        System.out.println("Carbs: " + carbs.getName());
        System.out.println("Protein: " + protein.getName());
        System.out.println("Fats: " + fats.getName());
        System.out.println();
    }
}
