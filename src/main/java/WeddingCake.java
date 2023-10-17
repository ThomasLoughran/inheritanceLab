public class WeddingCake extends Cake{

    private int tiers;
    private String message;

    public WeddingCake(String name, String baseFlavour, int cost, int tiers){
        super(name, baseFlavour, cost);
        this.tiers = tiers;
        this.message = "Congratulations!";
    }

    public int getTiers() {
        return this.tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getInstruction(){
        return "I'm for sharing!";
    }

    public int servings(){
        return 50;
    }
}
