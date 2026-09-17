package github.lucasas;

public class Level4 {
    void main() {
        System.out.println(add(10, 12));
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int clamp(int value, int min, int max) {
        if (value > max) {
            return max;
        }

        if (value < min) {
            return min;
        }

        return value;
    }
}
