public class Runner extends Athlete implements IRun, ISwim {

    public void run(int distance){
        distanceTravelled += distance;
    }

    public void swim(int distance){
        distanceTravelled += distance;
    }
}
