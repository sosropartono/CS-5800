// StateOfVendingMachine class representing the state of the vending machine
public class StateOfVendingMachine {
    String state;

    public StateOfVendingMachine() {
        this.state = "Idle";
    }

    public void changeState(String newState) {
        this.state = newState;
    }

    public String getState() {
        return this.state;
    }
}