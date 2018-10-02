import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CdPlayer cdPlayer;
    Radio radio;
    RecordDeck recordDeck;
    CassettePlayer cassettePlayer;

    @Before
    public void setUp() {
        radio = new Radio();
        cdPlayer = new CdPlayer(1);
        ArrayList<Integer> playSpeeds = new ArrayList<>();
        playSpeeds.add(1);
        playSpeeds.add(2);
        playSpeeds.add(3);
        recordDeck = new RecordDeck(playSpeeds);
        cassettePlayer = new CassettePlayer();
        stereo = new Stereo(cdPlayer, radio, recordDeck, cassettePlayer);
    }

    @Test
    public void canTuneRadio() {
        stereo.tuneRadio("Planet Rock");
        assertEquals("Planet Rock", stereo.getRadio().getStation());
    }

    @Test
    public void canPlayCD() {
        assertEquals("playing album", stereo.getCdPlayer().play("album"));
    }
}
