package inheritance;

public class GlassHouse extends HouseTemplate {

    @Override
    public void buildFoundation() {
        System.out.println("Building foundation of the glass house");
    }

    @Override
    public void buildWindows() {
        System.out.println("The whole house is a window :)");
    }
}
