package github.lucasas.stats;

import java.util.Arrays;

public class StatisticsMain {

    void main() {
        int[] numbers = {45, 67, 23, 89, 34, 56, 78};
        printAllStats(numbers);
    }

    private void printAllStats(int[] numbers) {
        System.out.println("Average is " + calculateAverage(numbers));
        System.out.println("Max is " + findMax(numbers));
        System.out.println("Min is " + findMin(numbers));
        System.out.println("Count over average is " + countAboveAverage(numbers));
    }

    private double calculateAverage(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        return (double) sum / numbers.length;
    }

    private int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(0);
    }

    private int findMin(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(0);
    }

    private int countAboveAverage(int[] numbers) {
        double average = calculateAverage(numbers);
        return (int) Arrays.stream(numbers)
                .filter(number -> number > average)
                .count();
    }
}
