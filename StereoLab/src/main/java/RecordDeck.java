import java.util.ArrayList;

public class RecordDeck extends Component {

    private ArrayList<Integer> playSpeeds;

    public RecordDeck(ArrayList<Integer> playSpeeds) {
        this.playSpeeds = playSpeeds;
    }

    public int numberOfPlaySpeeds(){
        return this.playSpeeds.size();
    }


}
