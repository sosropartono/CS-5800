import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {



    private ArrayList<Food> foodItems;
    public List<String> toppings;

    public CustomerOrder() {
        foodItems = new ArrayList<>();
    }

    public void addItem(Food foodItem){
        foodItems.add(foodItem);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Food item : foodItems) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
}
