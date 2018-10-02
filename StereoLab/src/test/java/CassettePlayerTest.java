import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassettePlayerTest {

    CassettePlayer cassettePlayer;

    @Before
    public void setUp(){
        cassettePlayer = new CassettePlayer();
    }

    @Test
    public void canPlay() {
        assertEquals("playing cd", cassettePlayer.play("cd"));
    }
}
