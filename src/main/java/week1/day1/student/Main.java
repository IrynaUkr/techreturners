package week1.day1.student;

public class Main {
    public static void main(String[] args) {
        Student goodStudent = new Student("Tom", 'B', 4);
        System.out.println(goodStudent.getGrade());
        System.out.println("is upgraded  "+ goodStudent.upgrade());
        System.out.println(goodStudent.getGrade());
        Student badStudent = new Student("Ann", 'F', 4);
        System.out.println(badStudent.getGrade());
        System.out.println("is downgraded  "+ badStudent.downgrade());
        System.out.println(badStudent.getGrade());
    }
}
