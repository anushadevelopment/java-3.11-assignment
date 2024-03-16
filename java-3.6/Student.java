import java.util.ArrayList;

public class Student extends Person {
    private int studentId;
    private String course;
    private int yearEnrolled;
    private ArrayList<Double> grades;

    // constructors
    public Student(int studentId, String course, int yearEnrolled) {
        // super();
        this.studentId = studentId;
        this.course = course;
        this.yearEnrolled = yearEnrolled;
        this.grades = new ArrayList<Double>();
    }

    public Student(String name, int birhtYear, int studentId, String course, int yearEnrolled) {
        super(name, birhtYear); // Person(String name, int birthYear)
        this.studentId = studentId;
        this.course = course;
        this.yearEnrolled = yearEnrolled;
        this.grades = new ArrayList<Double>();
    }

    // getter and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(int yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    // add methods specific to Student
    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getAverageGrade() {
        double sum = 0;
        for(double grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public void attendClass() {
        System.out.println(this.name + " is attending class.");
    }

    public void doWork(String work){
        System.out.println(this.name + " is doing " + work);
    }

    @Override
    public void doWork() {
        super.doWork();
        System.out.println(this.name + " is studying");
    }

}
