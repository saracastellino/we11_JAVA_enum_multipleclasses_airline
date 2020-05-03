import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.BOEING737, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(180, plane.getCapacity());
    }

    @Test
    public void planeHasWeight() {
        assertEquals(200000, plane.getWeight());
    }

}
