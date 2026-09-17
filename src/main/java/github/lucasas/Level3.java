package github.lucasas;

public class Level3 {
    int dayNumber = 6;

    void main() {
        int number = getNumber();
        System.out.println(number);
    }

    private int getNumber() {
        return 42;
    }

    private int getDayNumber() {
        return dayNumber;
    }

    private boolean isWeekend() {
        return dayNumber == 6 || dayNumber == 7;
    }

    private String getDayType() {
        return isWeekend() ? "Weekend" : "Weekday";
    }

}
