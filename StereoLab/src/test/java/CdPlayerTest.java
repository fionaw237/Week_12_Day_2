import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void setUp(){
        cdPlayer = new CdPlayer(4);
    }

    @Test
    public void canPlay4CDs() {
        assertEquals(4, cdPlayer.getNumberofCds());
    }

    @Test
    public void canPlay() {
        assertEquals("playing cd", cdPlayer.play("cd"));
    }
}
