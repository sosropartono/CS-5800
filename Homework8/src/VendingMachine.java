// VendingMachine class representing the vending machine
public class VendingMachine {
    Snack[] snacks;
    StateOfVendingMachine state;
    SnackDispenseHandler chainOfHandlers;
    String selectedSnack;
    double remainingAmount;

    public VendingMachine(Snack[] snacks) {
        this.snacks = snacks;
        this.state = new StateOfVendingMachine();
        this.chainOfHandlers = createChainOfHandlers();
        this.remainingAmount = 0.0;
    }

    private SnackDispenseHandler createChainOfHandlers() {
        SnackDispenseHandler handlers = null;
        for (int i = this.snacks.length - 1; i >= 0; i--) {
            handlers = new SnackDispenseHandler(this.snacks[i], handlers);
        }
        return handlers;
    }

    public void selectSnack(String snackName) {
        if (this.state.getState().equals("Idle")) {
            for (Snack snack : this.snacks) {
                if (snack.quantity == 0){
                    System.out.println("Snack not available");
                    return;
                }
                if (snack.name.equalsIgnoreCase(snackName)) {
                    System.out.println("Selected " + snack.name + ". Please insert " + snack.price + " dollars.");
                    this.state.changeState("Waiting for Money");
                    this.selectedSnack = snackName;
                    return;
                }
            }
            System.out.println("Sorry, the selected snack is unavailable.");
        } else {
            System.out.println("Please wait for the current transaction to complete.");
        }
    }

    public void insertMoney(double amount) {
        System.out.println("Inserted " + amount );
        if (this.state.getState().equals("Waiting for Money")) {
            this.remainingAmount = this.chainOfHandlers.handleRequest(this.remainingAmount + amount, this.selectedSnack);
            if (this.remainingAmount <= 0.0) {
                this.state.changeState("Idle");
            }
        } else {
            System.out.println("Please select an available snack.");
        }
    }
}