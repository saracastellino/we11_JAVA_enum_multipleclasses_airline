public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType plane) {
        this.planeType = plane;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getCapacity() {
        return this.planeType.getCapacity();
    }

    public int getWeight() {
        return this.planeType.getWeight();
    }
}
