public class TrayBake extends Cake{

    private boolean hasSprinkles;

    public TrayBake(String name, String baseFlavour, int cost){
        super(name, baseFlavour, cost);
        hasSprinkles = false;
    }

    public boolean hasSprinkles() {
        return hasSprinkles;
    }

    public void setHasSprinkles(boolean hasSprinkles) {
        this.hasSprinkles = hasSprinkles;
    }

    public int servings(){
        return 6;
    }
}
