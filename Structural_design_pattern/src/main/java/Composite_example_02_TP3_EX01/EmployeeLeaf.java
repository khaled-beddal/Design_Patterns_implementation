package Composite_example_02_TP3_EX01;


//under manager

public class EmployeeLeaf implements Employee {
 
    private float salary;

    public EmployeeLeaf(float salary) {
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return salary;
    }
    
    
}
