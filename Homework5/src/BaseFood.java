public class BaseFood implements Food{

    private double basePrice;

    public BaseFood(double price){
        basePrice = price;

    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
