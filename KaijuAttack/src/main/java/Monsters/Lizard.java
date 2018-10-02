package Monsters;

public class Lizard extends Kaiju implements IMove{

    public Lizard(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String move(){
        return this.getName() + " is moving";
    }
}
