public class Student {
    public static final Course DEFAULT_COURSE = new Course("JAVA", 10000);
    public int admin_no;
    public String stu_name;
    private Course course_joined;
    private double totalFee;
    private double feePaid;

    public Student(int admin_no, String stu_name, Course course_joined) {
        this.admin_no = admin_no;
        this.stu_name = stu_name;
        this.course_joined = course_joined;
        this.totalFee = course_joined.getCourseFee();
        this.feePaid = 0;
    }

    public Student(int admin_no, String stu_name) {
        this(admin_no, stu_name, DEFAULT_COURSE);
    }

    public void payment(double amount) {
        double due = this.getDue();
        if (amount >= due) {
            feePaid = totalFee;
            System.out.println("Total Course Fee Cleared");
            System.out.println("Remaining amount : " + (amount - due) + "Rs/-");
        } else {
            feePaid += amount;
            System.out.println("Fee Cleared : " + feePaid);
            System.out.println("Due : " + this.getDue());
        }
    }

    public String getCourseName() {
        return this.course_joined.getCourseName();
    }

    public double getTotalFee() {
        return totalFee;
    }

    public double getFeePaid() {
        return feePaid;
    }

    public double getDue() {
        return (totalFee - feePaid);
    }
}
