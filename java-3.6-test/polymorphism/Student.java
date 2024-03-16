package polymorphism;

import java.util.ArrayList;

public class Student extends Person{
    private int studentId;
    private String course;
    private int yearEnrolled;
    private ArrayList<Double> grades;


    public Student(int studentId, String course, int yearEnrolled) {
        this.studentId = studentId;
        this.course = course;
        this.yearEnrolled = yearEnrolled;
        this.grades = new ArrayList<Double>();
    }
    public Student(String name, int birthYear, int studentId, String course, int yearEnrolled
           ) {
        super(name, birthYear);
        this.studentId = studentId;
        this.course = course;
        this.yearEnrolled = yearEnrolled;
        this.grades = new ArrayList<Double>();
    }
    public Student() {
    }
    public Student(String name, int birthYear) {
        super(name, birthYear);
    }
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
    public void addGrade(Double grade){
        this.grades.add(grade);
    }
    public double getAverageGrade(){
        double sum = 0;
        for (double grade : grades){
            sum += grade;
        }
        return sum/ grades.size();
    }    

    public void attendClass(){
        // System.out.println(this.getName() + " attending class"); // if protected is not used during variable declaration
        System.out.println(this.name + " is attending class"); // if protected access modifier is used during variable declaration eg: protected String name
    }
}
