package ss7_Abstract_Interface.thuc_hanh.interface_Comparable;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle>{

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

//    @Override
//    public int compareTo(ComparableCircle o) {
//        return 0;
//    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
