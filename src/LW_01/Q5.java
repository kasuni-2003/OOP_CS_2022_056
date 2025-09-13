package LW_01;

import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter inner radius (ri): ");
        double ri=input.nextDouble();

        System.out.print("Enter outer radius (ro): ");
        double ro=input.nextDouble();

        Circle innerCircle=new Circle(ri);
        Circle outerCircle=new Circle(ro);

        double shadedArea=outerCircle.computeArea()-innerCircle.computeArea();

        System.out.println("The area of the circular region is: " + shadedArea);

    }
}
