/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overflowexception_class_task;

/**
 *
 * @author dell
 */
public class OverflowException_class_task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        counter aCounter = new counter(0);
        counter eCounter = new counter(100);
        counter iCounter = new counter(100);
        counter oCounter = new counter(100);
        counter uCounter = new counter(100);

        String s = "welcome in java oop";
//        char[] chrArr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                try {
                    aCounter.increment();
                } catch (Exception e) {
                    System.out.println("\n===========exception=================");
                    System.out.println(e.getMessage());
                }
            } else if (s.charAt(i) == 'e') {
                try {
                    eCounter.increment();
                } catch (Exception e) {
                    System.out.println("\n===========exception================");
                    System.out.println(e.getMessage());
                }
            } else if (s.charAt(i) == 'i') {
                try {
                    iCounter.increment();
                } catch (Exception e) {
                    System.out.println("\n===========exception=================");
                    System.out.println(e.getMessage());
                }
            } else if (s.charAt(i) == 'o') {
                try {
                    oCounter.increment();
                } catch (Exception e) {
                    System.out.println("\n===========exception==================");
                    System.out.println(e.getMessage());
                }
            } else if (s.charAt(i) == 'u') {
                try {
                    uCounter.increment();
                } catch (Exception e) {
                    System.out.println("\n===========exception==================");
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Frequency of 'a': " + aCounter.get_count());
        System.out.println("Frequency of 'e': " + eCounter.get_count());
        System.out.println("Frequency of 'i': " + iCounter.get_count());
        System.out.println("Frequency of 'o': " + oCounter.get_count());
        System.out.println("Frequency of 'u': " + uCounter.get_count());
    }

}

class OverflowException extends Exception {

    public OverflowException() {
        super("overflow occured");
    }

    public OverflowException(String message) {
        super(message);
    }
}

class counter {

    int count; // current value of the counter.
    int maxcnt;// max value conuter can hold.

    public counter(int max_count) {
        this.maxcnt = max_count;
        this.count = 0;
    }

    // method makes overflow if a condition is true...
    public void increment() throws OverflowException {
        if (this.count < this.maxcnt) {
            this.count++;
        } else {
            throw new OverflowException("counter overflow!!!");
        }
    }

    public void reset() {
        this.count = 0;
    }

    public int get_count() {
        return this.count;
    }
}
