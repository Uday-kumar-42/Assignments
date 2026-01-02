public class Course {
    public static final double BASE_PRICE = 1000.0;
    private String course_name;
    private double course_fee; 

    public Course(String course_name,double course_fee){
        this.course_name = course_name;
        this.course_fee = course_fee;
    }

    public Course(String course_name){
        this(course_name, BASE_PRICE);
    }

    public String getCourseName(){
        return this.course_name;
    }

    public double getCourseFee(){
        return this.course_fee;
    }
}
