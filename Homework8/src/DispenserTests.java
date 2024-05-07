import org.junit.Test;
import static org.junit.Assert.*;

public class DispenserTests {

    @Test
    public void testSnickersWithZeroQuantity() {
        Snack[] snacks = {
                new Snack("Coke", 1.50, 5),
                new Snack("Pepsi", 1.50, 3),
                new Snack("Cheetos", 2.00, 4),
                new Snack("Snickers", 1.25, 0)  // Snickers with 0 quantity
        };
        VendingMachine vendingMachine = new VendingMachine(snacks);

        vendingMachine.selectSnack("Snickers");
        assertEquals("Idle", vendingMachine.state.getState());
    }
    @Test
    public void testSelectSnack() {
        Snack[] snacks = {
                new Snack("Coke", 1.50, 5),
                new Snack("Pepsi", 1.50, 3),
                new Snack("Cheetos", 2.00, 4),
                new Snack("Doritos", 1.75, 2),
                new Snack("KitKat", 1.25, 3),
                new Snack("Snickers", 1.25, 1),
                new Snack("Twix", 1.50, 0)
        };
        VendingMachine vendingMachine = new VendingMachine(snacks);

        vendingMachine.selectSnack("Coke");
        assertEquals("Waiting for Money", vendingMachine.state.getState());
        assertEquals("Coke", vendingMachine.selectedSnack);

    }
    @Test
    public void testSnickersWithOneQuantity() {
        Snack[] snacks = {
                new Snack("Coke", 1.50, 5),
                new Snack("Pepsi", 1.50, 3),
                new Snack("Cheetos", 2.00, 4),
                new Snack("Snickers", 1.25, 1)  // Snickers with 1 quantity
        };
        VendingMachine vendingMachine = new VendingMachine(snacks);

        vendingMachine.selectSnack("Snickers");
        assertEquals("Waiting for Money", vendingMachine.state.getState());
        assertEquals("Snickers", vendingMachine.selectedSnack);

        vendingMachine.insertMoney(1.25); // Sufficient funds
        assertEquals("Idle", vendingMachine.state.getState());
        assertEquals(0, snacks[3].quantity); // Quantity should reduce to 0 after successful purchase
    }
}
