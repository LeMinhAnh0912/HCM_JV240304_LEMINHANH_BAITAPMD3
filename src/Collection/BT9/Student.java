package src.Collection.BT9;

public class Student {
    //    Viết một class Student với các thuộc tính sau:
//    Mã số sinh viên (studentId) kiểu int.
//    Họ và tên (name) kiểu String.
//    Điểm trung bình (averageScore) kiểu double.
//    Viết các phương thức getter và setter cho các thuộc tính của class Student.
    private int studentId;
    private String studentName;
    private double averageScore;

    public Student() {

    }

    public Student(int studentId, String studentName, double averageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
