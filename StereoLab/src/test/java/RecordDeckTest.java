import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void setUp() {
        ArrayList<Integer> playSpeeds = new ArrayList<>();
        playSpeeds.add(1);
        playSpeeds.add(2);
        playSpeeds.add(3);
        recordDeck = new RecordDeck(playSpeeds);
    }

    @Test
    public void hasThreePlaySpeeds() {
        assertEquals(3, recordDeck.numberOfPlaySpeeds());
    }

    @Test
    public void canPlay() {
        assertEquals("playing cd", recordDeck.play("cd"));
    }
}
