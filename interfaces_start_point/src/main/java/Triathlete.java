public class Triathlete extends Athlete implements ICanDoTriathlon{

    public void run(int distance){
        distanceTravelled += distance;
    }

    public void swim(int distance){
        distanceTravelled += distance;
    }

    public void cycle(int distance){
        distanceTravelled += distance;
    }

}
