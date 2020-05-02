import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(60, plane.getCapacity());
    }

    @Test
    public void planeHasWeight() {
        assertEquals(10000, plane.getWeight());
    }

}
