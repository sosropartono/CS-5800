public class Cheese extends ToppingDecorator{

    public Cheese(Food food) {
//      basically intiializes the food
        super(food);
        COST = 2.0;

    }

    @Override
    public double getPrice() {
        return food.getPrice() + COST;
    }
}
