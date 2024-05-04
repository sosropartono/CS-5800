import junit.framework.*;
import org.junit.Test;
import org.junit.runner.OrderWith;

public class Testing {

    @Test
    public void priceTest() {
        Food chickenSando = new BaseFood(5.0);
        assert chickenSando.getPrice() == 5.0;
    }

    @Test
    public void toppingTest(){
        Food burger = new BaseFood(5.0);
        Food burgerWithCheese = new Cheese(burger);
        assert burgerWithCheese.getPrice() == 7.0;
    }

    @Test
    public void customerOrderTest(){
        Food burger = new BaseFood(5.0);
        Food burgerWithCheese = new Cheese(burger);
        CustomerOrder order = new CustomerOrder();
        order.addItem(burgerWithCheese);
        order.addItem(burger);
        assert 12.0 == order.getTotalCost();
    }


    @Test
    public void loyaltyAppliedTest(){
        Food burger = new BaseFood(5.0);
        Food burgerWithCheese = new Cheese(burger);
        CustomerOrder order = new CustomerOrder();
        order.addItem(burgerWithCheese);
        order.addItem(burger);
        Loyalty loyalty = new Loyalty();
        double price = loyalty.applyDiscount(order.getTotalCost());
        assert price < order.getTotalCost();
    }

    @Test
    public void multipleToppingsTest(){
        Food burger = new BaseFood(5.0);
        Food burgerWithCheese = new Cheese(burger);
        Food burgerWAvacadoCheese = new Avacado(burgerWithCheese);
        CustomerOrder order = new CustomerOrder();
        order.addItem(burgerWAvacadoCheese);
        System.out.println(order.toppings);
        assert 8.5 == order.getTotalCost();
    }
}
