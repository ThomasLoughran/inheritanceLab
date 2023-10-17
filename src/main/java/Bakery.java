import java.util.ArrayList;

public class Bakery {

    String street;
    ArrayList<Cake> cakes;

    public Bakery(String street){
        this.street = street;
        cakes = new ArrayList<>();
    }

    public void addCake(Cake cake){
        cakes.add(cake);
    }

    public int getSizeOfCakes(){
        return cakes.size();
    }

}
