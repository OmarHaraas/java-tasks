/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fraction_class_task;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Fraction_class_task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("================object 1 =============");
        System.out.print("Enter num1: ");
        int num = s.nextInt();

        System.out.print("Enter denum1: ");
        int denum = s.nextInt();
        Fraction f1 = new Fraction(num, denum);

        System.out.print("Enter num2: ");
        num = s.nextInt();

        System.out.print("Enter denum2: ");
        denum = s.nextInt();
        Fraction f2 = new Fraction(num, denum);

        System.out.println(f1.ToString());
        System.out.println(f2.ToString());

        System.out.println("");
    }
}

class Fraction {

    private int num;
    private int denum;

    public Fraction() {
        this.num = 0;
        this.denum = 0;
    }

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    // properties:
    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenum() {
        return this.denum;
    }

    public void setDenum(int denum) {
        this.denum = denum;
    }

    public String ToString() {
        return this.num + "/" + this.denum;
    }

    public double add(Fraction f) {
        // a >> this.num  / b >> this.deum
        // c >> f.num  / d >> f.deum

        //add >>        (a*d + b*c)/(b*d)
        return (this.num * f.denum + this.denum * f.num) / (this.denum * f.denum);
    }

    public double multiply(Fraction f) {
        // a*c/b*d
//        return (this.num * f.num) +" / "+ (this.denum * f.denum);
        return (this.num * f.num) / (this.denum * f.denum);
    }
}
