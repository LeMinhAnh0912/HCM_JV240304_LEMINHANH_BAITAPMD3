package Day4.BTTH2.RikkeiAcademy;

public class Student {
    String studentId;
    String studentName;
    String sex;
    String className;
    int age;
    String address;

    public Student(String studentId, String studentName, String sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public String display() {
        return " student " + studentId + " studentName " + studentName + " sex " + sex + " className " + className
                + " age " + age + " address " + address;
    }
}
