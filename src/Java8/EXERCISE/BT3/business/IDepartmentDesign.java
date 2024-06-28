package src.Java8.EXERCISE.BT3.business;

import src.Java8.EXERCISE.BT3.entity.Department;
import src.Java8.EXERCISE.BT3.entity.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IDepartmentDesign extends IGenericDesign<Department, String> {

    Set<Map.Entry<Department, Integer>> mostCrowded();

    List<Employee> employeeSalaryMax();
}
