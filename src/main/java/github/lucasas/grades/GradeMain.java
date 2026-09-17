package github.lucasas.grades;

public class GradeMain {
    private int assignmentPoints = 0;
    private int examPoints = 0;
    private int projectPoints = 0;

    void main() {
        addPoints(25, PointType.ASSIGNMENT);
        addPoints(40, PointType.EXAM);
        addPoints(30,PointType.PROJECT);
        printTotal();
        System.out.println(getGrade());
    }

    private void addPoints(int points, PointType type) {
        switch (type) {
            case EXAM -> examPoints += points;
            case PROJECT -> projectPoints += points;
            case ASSIGNMENT -> assignmentPoints += points;
        }
    }

    private int getTotal() {
        return assignmentPoints + examPoints + projectPoints;
    }

    private void printTotal() {
        System.out.println("Totalen er " + getTotal());
    }

    private String getGrade() {
        int totalScore = getTotal();
        if (totalScore >= 86) {
            return "12";
        }
        if (totalScore >= 71) {
            return "7";
        }
        if (totalScore >= 51) {
            return "00";
        }
        return "-3";
    }

}
