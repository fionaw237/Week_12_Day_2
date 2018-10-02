import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunnerTest {

    Runner runner;

    @Before
    public void before() {
        runner = new Runner();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, runner.getDistanceTravelled());
    }

    @Test
    public void canRun() {
        runner.run(10);
        assertEquals(10, runner.getDistanceTravelled());
    }

    @Test
    public void canSwim() {
        runner.swim(20);
        assertEquals(20, runner.getDistanceTravelled());
    }

//    @Test
//    public void canBeReferredToAsInterfaceType() {
//        IRun runner2 = new Runner();
//        runner2.run(10);
//
//        assertEquals(10, runner2.getDistanceTravelled());
//
//    }
}
