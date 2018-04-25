package inheritance;

public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildFoundation() {
        System.out.println("Building foundation for the wooden house");
    }

    @Override
    public void buildWindows() {
        System.out.println("Building wood coated windows");
    }
}
