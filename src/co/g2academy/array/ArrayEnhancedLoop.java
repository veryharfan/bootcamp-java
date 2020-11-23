package co.g2academy.array;

public class ArrayEnhancedLoop {

    private int[] list = {1, 5, 6, 8, 10};


    public int calculateSumOfAllItems() {
        int sum = 0;
        for (int item : list){
            sum = sum + item; // calculation
        }
        return sum;
    }

    public int calculateMultiplicationOfAllItems() {
        int multiplication = 1;
        for (int element : list) {
            multiplication = multiplication * element;
        }
        return multiplication;
    }

    public int calculateAverageOfAllItems() {
        return calculateSumOfAllItems() / list.length;

    }
}
