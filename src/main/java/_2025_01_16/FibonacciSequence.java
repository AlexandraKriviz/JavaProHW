package _2025_01_16;

public class FibonacciSequence {

    private int length;

    public FibonacciSequence(int length) {
        setLength(length);
    }

    public void setLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Not possible.");
        }
        this.length = length;
    }

    public int[] findFibonacciFor() {
        int[] fibonacci = new int[length];
        if (length > 0) {
            fibonacci[0] = 0;
        }
        if (length > 1) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public int[] findFibonacciWhile() {
        int[] fibonacci = new int[length];

        if (length > 0) {
            fibonacci[0] = 0;
        }
        if (length > 1) {
            fibonacci[1] = 1;
        }
        int i = 2;
        while (i < length) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        return fibonacci;
    }

    public int[] findFibonacciDoWhile() {
        int[] fibonacci = new int[length];

        if (length > 0) {
            fibonacci[0] = 0;
        }
        if (length > 1) {
            fibonacci[1] = 1;
        }
        int i = 2;

        do {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        } while (i < length);
        return fibonacci;
    }
}

