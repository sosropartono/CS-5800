public class CargoShip extends Ship{

    public int getTonnage() {
        return cargoCapacity;
    }

    public void setTonnage(int tonnage) {
        this.cargoCapacity = tonnage;
    }

    private int cargoCapacity;
    @Override
    public String toString() {
        return "Name: " + super.getName() + " Cargo Capacity: " + cargoCapacity;
    }

    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;

    }
}
