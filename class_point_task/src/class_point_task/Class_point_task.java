/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_point_task;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Class_point_task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Quadr[] shape = new Quadr[10];
        System.out.println("Enter Q if Quadr,,,,R if Rectangle");
        for (int i = 0; i < shape.length; i++) {
            System.out.print("choice " + i + 1 + " is: ");
            String choice = s.next();
            if (choice.toUpperCase() == "Q") {
                shape[i] = new Quadr();
                shape[i].getQuadr();
                System.out.println("");
            } else if (choice.toUpperCase() == "R") {
                shape[i] = new Rectangle();
                shape[i].getQuadr();
                System.out.println("");
            } else {
                System.out.println("We only accept 'Q' or 'R', lower or uppercase");
                i--;
            }
        }
        System.out.println("=================================");
        for (int i = 0; i < shape.length; i++) {
            shape[i].display_Quadr();
        }
    }

}

class Point {

    private double x, y;

    public void getPoint() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = s.nextDouble();
        System.out.print("Enter y: ");
        y = s.nextDouble();
    }

    public void dispPoint() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public double distance(Point p) {
        return Math.sqrt(((this.x - p.x) * (this.x - p.x))
                + ((this.y - p.y) * (this.y - p.y)));
//        System.out.println("distance = " + distance);
    }

}

class Quadr {

    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    Point p4 = new Point();

    double area;

    public void getQuadr() {/// take points from user..
        p1.getPoint();
        p2.getPoint();
        p3.getPoint();
        p4.getPoint();
    }

    public void display_Quadr() {
        System.out.println("displaying quad");
        p1.dispPoint();
        p2.dispPoint();
        p3.dispPoint();
        p4.dispPoint();
    }

    public double getArea() { //.area.\\
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p1.distance(p3);
        double s = (a + b + c) / 2;
        double triangle1_area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        //second tringle area:
        a = p1.distance(p4);
        b = p4.distance(p3);
        // c as it was distance between p1 and p3
        double triangle2_area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        //return total area://
        return triangle1_area + triangle2_area;
    }
}

class Rectangle extends Quadr {

    double length;
    double width;

    public double getArea() {
        return length * width;
    }

    public void display_Quadr() {
        System.out.println("Rectangle with " + length + " and " + width);
    }

    public double getlength() { // return big distance
        return Math.max(p1.distance(p2) , p1.distance(p3));
    }

    public double getwidth() {
        return Math.min(p1.distance(p2) , p1.distance(p3));
    }
}
