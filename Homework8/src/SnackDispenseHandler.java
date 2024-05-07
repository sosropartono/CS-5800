public class SnackDispenseHandler {
    Snack snack;
    SnackDispenseHandler nextHandler;

    public SnackDispenseHandler(Snack snack, SnackDispenseHandler nextHandler) {
        this.snack = snack;
        this.nextHandler = nextHandler;
    }

    public double handleRequest(double moneyInserted, String snackName) {
        if (snackName.equalsIgnoreCase(this.snack.name)) {
            if (moneyInserted >= this.snack.price && this.snack.quantity > 0) {
                System.out.println("Dispensing " + this.snack.name);
                this.snack.quantity--;
                return moneyInserted - this.snack.price;
            } else if (this.nextHandler != null) {
                return this.nextHandler.handleRequest(moneyInserted, snackName);
            } else {
                System.out.println("Insufficient funds or snack unavailable.");
                return moneyInserted;
            }
        } else if (this.nextHandler != null) {
            return this.nextHandler.handleRequest(moneyInserted, snackName);
        } else {
            System.out.println("Selected snack is not available.");
            return moneyInserted;
        }
    }
}