public class ToppingDecorator implements Food{

    protected Food food;
    protected double COST;

    public ToppingDecorator(Food foodItem) {
        this.food = foodItem;
    }

    public double getPrice(){
        return food.getPrice();
    }




}
