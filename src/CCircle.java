public class CCircle extends Circle implements Comparable<CCircle>{
    public CCircle() {
    }

    public CCircle(double radius) {
        super(radius);
    }

    public CCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }
    @Override
    public int compareTo() {
        if (getRadius() > CCircle.getRadius()) return 1;
        else if (getRadius() <CCircle.getRadius()) return -1;
        else return 1;
    }
}
