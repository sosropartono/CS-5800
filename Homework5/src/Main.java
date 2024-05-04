public class Main {
    public static void main(String[] args) {
        // Create food items with base prices
        Food chickenSando = new BaseFood(5.0);
        Food fries = new BaseFood(3.0);
        Food burger = new BaseFood(4.0);
        Food chickenSandoCheese = new Cheese(chickenSando);
        Food truffleFries = new Bacon(fries);
        Food burgerWAvacado = new Avacado(burger);
        CustomerOrder order = new CustomerOrder();
        order.addItem(truffleFries);

        order.addItem(chickenSandoCheese);
        order.addItem(burgerWAvacado);

        double totalCost = order.getTotalCost();
        System.out.println("Total cost before discount: $" + totalCost);

        Loyalty loyaltyStatus = new Loyalty();
        totalCost = loyaltyStatus.applyDiscount(totalCost);

        System.out.println("Total cost after discount: $" + totalCost);
    }
}