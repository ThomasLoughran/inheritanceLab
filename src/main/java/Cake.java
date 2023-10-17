public abstract class Cake {

    private String name;
    private String baseFlavour;
    private int cost;


    public Cake(String name, String baseFlavour, int cost){
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseFlavour() {
        return this.baseFlavour;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getInstruction(){
        return "Eat me!";
    }

    public abstract int servings();
}
