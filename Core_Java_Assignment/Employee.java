public class Employee {

    public static final double DEFAULT_SALARY = 15000;

    public int emp_id;
    public String emp_name;
    protected double salary;
    // children classes can access the protected fields

    public Employee(int emp_id, String emp_name, double salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
    }

    public Employee(int emp_id, String emp_name) {
        this(emp_id, emp_name, DEFAULT_SALARY);
    }

    public double getSalary() {
        return salary;
    }
}

