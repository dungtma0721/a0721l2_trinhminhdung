package ss6_Inheritance_Polymorphism.bai_tap.point2d3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D point2D1 = new Point2D(2,3);
        Point3D point3D = new Point3D();
        Point3D point3D1 = new Point3D(2,3,4);

        System.out.println(point2D);
        System.out.println(point2D1);
        System.out.println(point3D);
        System.out.println(point3D1);

        point2D.setXY(2, 5);
        for(int i = 0 ; i < point2D.getXY().length ; i++) {
            System.out.println(point2D.getXY()[i]);
        }
        System.out.println("----------XYZ--------------");
        point3D.getXYZ(3, 5, 7);
        for(int i = 0 ; i < point3D.getXYZ().length ; i++) {
            System.out.println(point3D.getXYZ()[i]);
        }
    }
    }

