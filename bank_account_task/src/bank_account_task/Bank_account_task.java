/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank_account_task;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Bank_account_task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[]arr = new int[5];
        account[] arr = new account[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1 to sav_acct,=== 2 for cur_acct");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter type number: ");
            byte temp = s.nextByte();
            if (temp == 1) {
                System.out.println("========sav_acc===========");
                System.out.print("Enter accNum: ");
                int accNum = s.nextInt();

                System.out.print("Enter rate: ");
                double rate = s.nextDouble();

                System.out.print("Enter balance: ");
                double balance = s.nextDouble();
                arr[i] = new sav_acct(rate, accNum, balance);
            } else if (temp == 2) {
                System.out.println("========cur_acct===========");
                System.out.print("Enter accNum: ");
                int accNum = s.nextInt();

                System.out.print("Enter balance: ");
                double balance = s.nextDouble();

                System.out.print("Enter charge: ");
                double charge = s.nextDouble();

                arr[i] = new cur_acct(accNum, balance, charge);
            } else {
                System.out.println("خليك للصبح لازم تكتب واحد او اتنين");
                i--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].ToString());
        }
    }

}

class account {//base class

    int accNum;
    double balance;

    public account(int accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public String ToString() {
        return accNum + " " + balance;
    }

    public void deposit(double val) {
        if (val > 0) {
            balance += val;
        } else {
            System.out.println("Can Not add value less than or equal 0");
        }
    }

}

class sav_acct extends account {

    double rate;

    public sav_acct(double rate, int accNum, double balance) {
        super(accNum, balance);
        this.rate = rate;
    }

    public void compound() {
        balance += rate * balance;
    }

    public double withdraw(double amt) {
        if (amt <= balance) {
            //System.out.println("Successfully withdrawn, balance became: " + balance);
            balance -= amt;
            return amt;
        } else {
            //System.out.println("Can Not take value big than balance.");
            return 0;
        }
    }

    public String ToString() {
        return "sav_acct" + super.ToString();
    }

}
//================================================================

class cur_acct extends account {

    double charge;

    public cur_acct(int accNum, double balance, double charge) {
        super(accNum, balance);
        this.charge = charge;
    }

    public double cash_check(double amount) {
        if (amount + charge < balance) {
            balance = -(amount + charge);
            return (amount + charge);
        } else {
            return 0;
        }
    }

    public String ToString() {
        return "cur_acct " + super.ToString();
    }

}
