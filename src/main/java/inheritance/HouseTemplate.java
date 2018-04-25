package inheritance;

public abstract class HouseTemplate {

    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("house is build");
    }

    // default implementation
    private void buildPillars() {
        System.out.println("Building pillars");
    }

    // methods to be implemented by subclasses
    public abstract void buildFoundation();
    public abstract void buildWindows();

    private void buildWalls() {
        System.out.println("Building walls from bricks");
    }
}
