package inheritance;

public class HouseClient {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
