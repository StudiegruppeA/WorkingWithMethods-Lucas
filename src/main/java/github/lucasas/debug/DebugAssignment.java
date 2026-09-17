package github.lucasas.debug;

public class DebugAssignment {
    void main() {

        int a = 7, b = 42;
        int minimum = findMinimum(a, b);
        if (minimum == a) {
            System.out.println("a is the smallest!");
            return;
        }
        System.out.println("b is the smallest!");
    }

    private int findMinimum(int a, int b) {
        return Math.min(a, b);
    }

}
