package week1.day1.student;

public class Student {
    private String name;

    private char grade;

    private int group;

    private String secretNickName;

    public Student(String name, char grade, int group) {
        validateGrade(grade);
        validateGroup(group);
        this.group = group;
        this.name = name;
        this.grade = grade;
    }

    private void validateGroup(int group) {
        if (group < 1 || group > 5) {
            throw new IllegalArgumentException("Group is not valid,it must be 1, 2, 3, 4, 5");
        }
    }

    private void validateGrade(char grade) {
        if (grade < 'A' || grade > 'F') {
            throw new IllegalArgumentException("Grade is not valid,it must be A, B, C, D, E, F");
        }
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    private void setSecretNickName(String secretNickName) {
        this.secretNickName = secretNickName;
    }

    protected boolean upgrade() {
        if (grade != 'A') {
            grade--;
            return true;
        }
        return false;
    }

    protected boolean downgrade() {
        if (grade != 'F') {
            grade++;
            return true;
        }
        return false;
    }

}
