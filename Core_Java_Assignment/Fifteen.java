public class Fifteen {
    public static void main(String[] args) {
        Course javaCourse = new Course("JAVA", 10000);

        // student object with explicit javaCourse provided
        Student student1 = new Student(1024, "Rahul", javaCourse);
        System.out.println("Student Name : " + student1.stu_name);
        System.out.println("Course Name : " + student1.getCourseName());
        System.out.println("Total Course Fee : " + student1.getTotalFee());
        student1.payment(4500);
        System.out.println("Total Fee Paid : " + student1.getFeePaid());
        System.out.println();

        // student object with no course provided
        // by default javaCourse will be assigned
        // as the default course is java
        Student student2 = new Student(2096, "Aneesh");
        System.out.println("Student Name : " + student2.stu_name);
        System.out.println("Course Name : " + student2.getCourseName());
        System.out.println("Total Course Fee : " + student2.getTotalFee());
        student2.payment(7500);
        System.out.println("Total Fee Paid : " + student2.getFeePaid());
        System.out.println();
    }
}
