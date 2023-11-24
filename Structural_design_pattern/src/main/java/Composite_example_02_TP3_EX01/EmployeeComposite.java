package Composite_example_02_TP3_EX01;


import java.util.ArrayList;
import java.util.List;

// EmployeeComposite => general Manager 

public class EmployeeComposite implements Employee {
    
    private List<Employee> employees = new ArrayList<>();


    
    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public Employee getChild(int index) {
        return employees.get(index);
    }
    
    @Override
    public float getSalary() {
        float totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
    
}
