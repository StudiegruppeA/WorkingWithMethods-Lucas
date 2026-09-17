package github.lucasas;

public class Level1 {
    void main() {
        sayHello();
        printSection("HEEEEEEEEEEEEEEEEEEEEEEEEEEELOO");
    }

    private void sayHello() {
        System.out.println("Hello!");
    }

    private void printSection(String content) {
        printHeader();
        System.out.println(content);
        printFooter();
    }

    private void printHeader() {
        System.out.println("=======================");
    }

    private void printFooter() {
        System.out.println("=======================");
    }
}
