package BehavioralDesignPattern.Observer;

public class Data {

    private String studentName;

    private int age;

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public Data(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }
}
