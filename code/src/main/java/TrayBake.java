public class TrayBake extends Cake implements IWeight{

    private boolean hasSprinkles;
    private int weight;

    public TrayBake(String name, String baseFlavour, int cost){
        super(name, baseFlavour, cost);
        this.hasSprinkles = false;
        this.weight = 500;
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

    public int getWeight(){
        return weight;
    }
}
