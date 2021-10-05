package ss4_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double x, double y, double z){
        this.a=x;
        this.b=y;
        this.c=z;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2) -4*this.a*this.c;
    }
    //Return the roots
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant()) / (2 * a));
    }
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant()) / (2 * a));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, and c in order: ");
        System.out.println("En ter a: ");
        double a = input.nextDouble();
        System.out.println("En ter b: ");
        double b = input.nextDouble();
        System.out.println("En ter c: ");
        double c = input.nextDouble();
        //ta doi tuong
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        if (qe.getDiscriminant()>0){
            System.out.println("The roots of the equation are " + qe.getRoot1() + " and " + qe.getRoot2());
        }
        else if (qe.getDiscriminant()==0){
            System.out.println("The roots of the equation are " + qe.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }
    }
}
