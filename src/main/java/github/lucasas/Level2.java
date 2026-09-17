package github.lucasas;

import java.util.Arrays;

public class Level2 {
    void main() {
        printName("Lucas");
        int[] numbers = {23, 12, 12, 43};
        printArraySum(numbers);
    }

    private void printArraySum(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum is " + sum);
    }

    private void printName(String name) {
        System.out.println("Name: " + name);
    }


}
