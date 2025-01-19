package _2025_01_16;

public class FibonacciSequenceApp {

    public static void main(String[] args) {

        FibonacciSequence fibonacciSequence = new FibonacciSequence(8);

        int[] fibonacciFor = fibonacciSequence.findFibonacciFor();
        int[] fibonacciWhile = fibonacciSequence.findFibonacciWhile();
        int[] fibonacciDoWhile = fibonacciSequence.findFibonacciDoWhile();

        System.out.println("Fibonacci with For Loop: ");
        for (int num : fibonacciFor) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Fibonacci with While Loop: ");
        for (int num : fibonacciWhile) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Fibonacci with DoWhile Loop: ");
        for (int num : fibonacciDoWhile) {
            System.out.print(num + " ");
        }


    }
}
