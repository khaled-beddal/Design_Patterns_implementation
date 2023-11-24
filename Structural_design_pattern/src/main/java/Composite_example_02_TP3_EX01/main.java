package Composite_example_02_TP3_EX01;


public class main {
    public static void main(String[] args) {
        EmployeeComposite general_manager1 = new EmployeeComposite();
        EmployeeComposite general_manager2 = new EmployeeComposite();

        EmployeeLeaf under_manager1 = new EmployeeLeaf(50000);
        EmployeeLeaf under_manager2 = new EmployeeLeaf(60000);

        general_manager1.add(under_manager1);
        general_manager2.add(under_manager2);

        float totalSalary = general_manager1.getSalary() + general_manager2.getSalary();
        System.out.println("Total salary: " + totalSalary);
    }
}
