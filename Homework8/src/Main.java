public class Main  {
    public static void main(String[] args) {
        // Creating snacks
        Snack[] snacks = {
                new Snack("Coke", 1.50, 5),
                new Snack("Pepsi", 1.50, 3),
                new Snack("HotCheetos", 2.00, 4),
                new Snack("CoolRanchDoritos", 2.00, 6),
                new Snack("KitKat", 1.25, 2),
                new Snack("Snickers", 1.25, 0)  // Snickers with 0 quantity
        };

        // Creating vending machine
        VendingMachine vendingMachine = new VendingMachine(snacks);

        // Test cases
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(1.50);

        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(1.50);

        vendingMachine.selectSnack("HotCheetos");
        vendingMachine.insertMoney(2.00);

        vendingMachine.selectSnack("CoolRanchDoritos");
        vendingMachine.insertMoney(2.00);

        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(1.25);

        vendingMachine.selectSnack("Snickers"); // Triggers 0 snickers
        vendingMachine.insertMoney(1.25);
    }
}
