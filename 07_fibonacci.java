import java.util.*;

class Fibonacci {
    public static int getFib(int n)
    {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return getFib(n - 1) + getFib(n - 2);
        }
    }

    public static void fibRange(int upper) {
        System.out.print("Fibonacci series of length " + upper + ": ");
        for (int i = 0; i < upper; i++) { 
            System.out.print(Fibonacci.getFib(i) + " ");
        }
    }
}

class Main {
    public static void main(String args[])
    {
        int number = Integer.parseInt(args[0]);
        Fibonacci.fibRange(number);
    }
}