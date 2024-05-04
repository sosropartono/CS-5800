public class Bacon extends ToppingDecorator{



    public Bacon(Food foodItem) {
        super(foodItem);
        COST = 2.0;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + COST;
    }
}
