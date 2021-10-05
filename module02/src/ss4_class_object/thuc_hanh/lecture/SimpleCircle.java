package ss4_class_object.thuc_hanh.lecture;

public class SimpleCircle {
    double radius;
    /* Construct a circle with radius */

    SimpleCircle() {    //public
        radius = 1;
    }

    /* Construct a circle with a specified radius */
    SimpleCircle(double newRadius) {  //public
        radius = newRadius; // this
    }

    /* Return the area of this circle */
    double getArea() {      //public
        return radius * radius * Math.PI;
    }

    /* return the perimeter of this circle */
    double getPerimeter() {     //public
        return 2 * radius * Math.PI;
    }

    /* set a new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
