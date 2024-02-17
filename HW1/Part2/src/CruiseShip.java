public class CruiseShip extends Ship{

    private int MAX_CAPACITY;

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    public void setMAX_CAPACITY(int newCapacity){
        MAX_CAPACITY = newCapacity;
    }

    public CruiseShip(String name, String year, int capacity) {
        super(name, year);
        MAX_CAPACITY = capacity;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + " Max Capacity: " + MAX_CAPACITY;
    }
}
