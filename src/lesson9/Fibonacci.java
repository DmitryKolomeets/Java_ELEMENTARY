package lesson9;

public class Fibonacci {

    public static int fibonacciNumber(int n) {

        int x = 1;
        int y = 1;

        for (int i = 2; i < n; i++) {
            y = x + y;
            x = y - x;
        }

        System.out.println("Fibonacci number is " + y +" in sequence of F(" + n +")");
        return y;
    }

    public static void main(String[] args) {

        fibonacciNumber(10);
    }
}


