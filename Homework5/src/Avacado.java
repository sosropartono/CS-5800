public class Avacado extends ToppingDecorator{
    private static final float COST = 1.5F;

    public Avacado(Food foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + COST;
    }
}
