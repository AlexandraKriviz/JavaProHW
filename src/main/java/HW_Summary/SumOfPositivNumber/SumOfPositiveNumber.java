package HW_Summary.SumOfPositivNumber;

public class SumOfPositiveNumber {

    public static int getSumOfEvenPositiveNumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}


