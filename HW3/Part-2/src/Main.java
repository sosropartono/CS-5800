import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Macronutrient interface
interface Macronutrient {
    String getName();
}

// Abstract Factory
interface MacronutrientFactory {
    Macronutrient createCarbs();
    Macronutrient createProtein();
    Macronutrient createFats();
}

// Driver program
public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Fredrick", "No Restriction"));
        customers.add(new Customer("William", "Paleo"));
        customers.add(new Customer("Robert", "Paleo"));
        customers.add(new Customer("Stephanie", "Vegan"));
        customers.add(new Customer("Evelyne", "Vegan"));
        customers.add(new Customer("Nina", "Nut Allergy"));

        for (Customer customer : customers) {
            customer.generateMeal();
        }
    }
}
