/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person_class_task;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Person_class_task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Person[] perso = new Person[10];
        System.out.println("press 1 if prof, 2 for student");
        String tmp = s.next();
        for (int i = 0; i < perso.length; i++) {
            if (tmp == "1") {
                System.out.println("=======Prof========");
                System.out.print("Enter prof" + i + 1 + " name: ");
                String name = s.next();
                System.out.print("Enter prof" + i + 1 + " age: ");
                int age = s.nextInt();
                perso[i] = new Professor(name, age);
            } else if (tmp == "2") {
                System.out.println("=======student========");
                System.out.print("Enter studet" + i + 1 + " name: ");
                String name = s.next();
                
                System.out.print("Enter studet" + i + 1 + " age: ");
                int age = s.nextInt();
                
                System.out.print("Enter studet" + i + 1 + " gpa: ");
                double gpa = s.nextDouble();

                perso[i] = new Student(name, age, gpa);
            } else {
                System.out.println("Uncorrect choice, 1 or 2 only.");
                i--;
            }
        }
        System.out.println("=============display=============");
        for (int i = 0; i < perso.length; i++) {
            System.out.println(perso[i].ToString());
        }
    }
}

abstract class Person {

    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String ToString() {
        return name + ' ' + age;
    }

    abstract boolean isOutstanding();

}

class Professor extends Person {

    int nPubs;

    public Professor(String name, int age, int nPlubs) {
        super(name, age);
        this.nPubs = nPlubs;
    }

    public Professor(String name, int age) {
        super(name, age);
    }

    @Override
    boolean isOutstanding() {
        //returns true if nPubs > 100, and false otherwise.
        if (nPubs > 100) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String ToString() {
        return name + ' ' + age + ' ' + nPubs;
    }

}

class Student extends Person {

    double gpa;

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    @Override
    public String ToString() {
        return name + ' ' + age + ' ' + gpa;
    }

    @Override
    boolean isOutstanding() {
        // returns true if gpa > 3.5, and false otherwise.
        if (gpa > 3.5) {
            return true;
        } else {
            return false;
        }
    }

}
