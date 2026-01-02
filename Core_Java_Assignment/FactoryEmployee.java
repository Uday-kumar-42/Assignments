public class FactoryEmployee extends Employee {

    private int bus_no;
    private String emp_boards;

    public FactoryEmployee(int emp_id, String emp_name, double salary,
            int bus_no, String emp_boards) {
        super(emp_id, emp_name, salary);
        this.bus_no = bus_no;
        this.emp_boards = emp_boards;
    }

    public FactoryEmployee(int emp_id, String emp_name,
            int bus_no, String emp_boards) {
        super(emp_id, emp_name);
        this.bus_no = bus_no;
        this.emp_boards = emp_boards;
    }

    public int getBusNo() {
        return bus_no;
    }

    public String getBoardingPoint() {
        return emp_boards;
    }
}
