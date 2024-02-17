public class ShipDriver {


    public static void main(String[] args) {
        Ship cruiseShip = new CruiseShip("Cruise","2024", 23000);
        Ship regShip = new Ship("Ship", "1999");
        Ship cargoShip = new CargoShip("CargoShip", "2022", 283287 );

        Ship[] shipArray = new Ship[3];
        shipArray[0] = regShip;
        shipArray[1] = cruiseShip;
        shipArray[2] = cargoShip;

        for(int i = 0; i < 3; i++){
            System.out.println(shipArray[i].toString());
        }

    }
}
