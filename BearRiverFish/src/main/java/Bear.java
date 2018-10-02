import java.util.ArrayList;

public class Bear {

//    ArrayList<Edible> belly;
    ArrayList<Fish> belly;


    public Bear() {
        this.belly = new ArrayList<>();
    }

    public int foodCount(){
        return this.belly.size();
    }

    public void eat(Fish food){
        this.belly.add(food);
    }
//    public void eat(Edible food){
//        this.belly.add(food);
//    }
}
