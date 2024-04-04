/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface_task;

import java.util.Scanner;

/**
 *
 * @author dell / /
 */
public class Interface_task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IShape[] a = new IShape[10];

        System.out.println("Enter 1 for Rectangle, Enter 2 for Cube..\n");
        for (int i = 0; i < 10; i++) {
            byte choice;
            System.out.print("Enter choice 1 or 2 of element " + i + ": ");
            choice = scanner.nextByte();
            if (choice == 1) {
                System.out.print("Enter length: ");
                int l = scanner.nextInt();
                System.out.print("Enter width: ");
                int w = scanner.nextInt();
                a[i] = new Rectangle(l, w);

            } else if (choice == 2) {
                System.out.print("Enter side: ");
                int s = scanner.nextInt();
                a[i] = new Cube(s);
            }else{
                System.out.println("مينفاااااااعش");
                i--;
            }

        }
        for (IShape shape : a) {
            System.out.println(shape.toString());
        }
        scanner.close();
    }

}

interface IShape {

    public void Area();

    public void Volume();
}

class TwoDimShape implements IShape {

    @Override
    public void Area() {

    }

    @Override
    public void Volume() {

    }
}

class ThreeDimShape implements IShape {

    @Override
    public void Area() {

    }

    @Override
    public void Volume() {

    }
}

class Rectangle extends TwoDimShape {

    private int length, width;

    public Rectangle(int length, int wid) {
        this.length = length;
        this.width = width;
    }

    public String ToString() {
        return "Rectangle of length = " + this.length + ", width = " + this.width;
    }

    @Override
    public void Area() {
        int area = this.length * this.width;
        System.out.println("Rectangle Area = " + area);
    }

}

class Cube extends ThreeDimShape {

    private int side;

    public Cube(int s) {
        side = s;
    }

    public String ToString() {
        return "Cube with side = " + side;
    }

    @Override
    public void Area() {
        double SurfaceArea = 6.0 * side * side;
        System.out.println("Surface Area = " + SurfaceArea);
    }

    @Override
    public void Volume() {
        double vol = side * side * side;
        System.out.println("Volume = " + vol);
    }
}
