import java.util.ArrayList;

public class SpongeCake extends Cake{

    private boolean isVegan;
    private ArrayList<String> toppings;

    public SpongeCake(String name, String baseFlavour, int price){
        super(name, baseFlavour, price);
        isVegan = false;
        toppings = new ArrayList<>();
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


}
