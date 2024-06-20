package src.Collection.BT9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    public static List<Student> students = new ArrayList<>();

    //Phương thức void addStudent(Student student) để thêm một sinh viên vào danh sách sinh viên
    public void addStudent(Student student) {
        students.add(student);
    }

    //Phương thức show all hiển thị tất cả student trong chương trình.
    public void showAll() {
        if (students.isEmpty()) System.out.println("Không có học sinh nào");
        else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    //Phương thức void removeStudent(int studentId) để xóa sinh viên có mã số sinh viên là studentId khỏi danh sách sinh viên.
    public void removeStudent(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                System.out.println("Xóa học sinh có mã " + studentId + " thành công!!!");
                return;
            }
        }
        System.out.println("Không tìm thấy id");
    }

    //Phương thức Student findStudentById(int studentId) để tìm kiếm sinh viên có mã số
    // sinh viên là studentId và trả về đối tượng Student tương ứng.
    // Nếu không tìm thấy sinh viên nào thì hiển thị “không tìm thấy sinh viên” và trả về null.
    public Student findStudentById(int studentId) {
        boolean isExist = false;
        Student studentFind = null;
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                studentFind = student;
                isExist = true;
                break;
            }
        }
        if (isExist) {
            System.out.println("Tìm thấy học sinh có mã " + studentId + " thành công!!!");
            return studentFind;
        }

        return null;
    }

    //Phương thức getAverageScore tính và trả về điểm trung bình của tất cả student.
    public double getAverageScore() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageScore();
        }
        return sum / students.size();
    }

    //Phương thức sortByScore sắp xếp sinh viên theo điểm tăng dần.
    public void sortByScore() {
        students.sort(Comparator.comparing(Student::getAverageScore));
        System.out.println("Sắp xếp sinh viên theo điểm tăng dần thành công!!!");
        showAll();
    }
}
