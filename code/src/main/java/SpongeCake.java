import java.util.ArrayList;

public class SpongeCake extends Cake implements IWeight{

    private boolean isVegan;
    private ArrayList<String> toppings;
    private int weight;

    public SpongeCake(String name, String baseFlavour, int price){
        super(name, baseFlavour, price);
        this.isVegan = false;
        this.toppings = new ArrayList<>();
        this.weight = 450;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public int getToppingsSize() {
        return toppings.size();
    }

    public void addToppings(String topping) {
        this.toppings.add(topping);
    }

    public int servings(){
        return 5;
    }

    public int getWeight(){
        return weight;
    }

}
