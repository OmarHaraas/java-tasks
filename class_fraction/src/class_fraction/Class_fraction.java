/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_fraction;

import java.awt.*;
import javax.swing.*;

public class Class_fraction extends JFrame {

    static JTextField txtNum1, txtDeum1, txtNum2, txtDeum2;
    JButton button;

    public Class_fraction() {
        setTitle("Fraction class task1s 1");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a text field
        txtNum1 = new JTextField(20);
        txtNum2 = new JTextField(20);
        txtDeum1 = new JTextField(20);
        txtDeum2 = new JTextField(20);

        panel.add(txtNum1);
        panel.add(txtNum2);
        panel.add(txtDeum1);
        panel.add(txtDeum2);

        // Create a button
        button = new JButton("Click Me");
        panel.add(button);

        // Add the panel to the JFrame
        add(panel);

        // Make the JFrame visible
        setVisible(true);

    }

    // main
    public static void main(String[] args) {

        
        // Create the GUI on the event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Class_fraction();
            }
        });
        Fraction f1 = new Fraction(Integer.parseInt(txtNum1.getText()), 
                Integer.parseInt(txtDeum1.getText()));
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
        return (this.num * f.num) / (this.denum * f.denum);
    }
}
/////////////
