import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;
    
    @Before
    public void setUp(){
        radio = new Radio();
    }

    @Test
    public void canBeTuned() {
        radio.tune("Planet Rock");
        assertEquals("Planet Rock", radio.getStation());
    }
}
