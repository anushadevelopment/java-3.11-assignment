public class App {
    public static void main(String[] args) {
        // Person person = new Person("Tony Stark", 1975);
        // person.setBirthYear(0);
        // person.greet();
        // person.doWork();

        // Instantiate a Student object
        Student student = new Student("Tony", 1995, 1, "Computer Science", 2022);

        // Calling methods from the Person (Parent) class
        student.greet();
        student.doWork();
        student.doWork("homework");

        // Calling methods from the Student (Child) class
        System.out.println("I am studying " + student.getCourse() + ".");
        student.addGrade(80);
        student.addGrade(90);
        System.out.println("My average grade is " + student.getAverageGrade());

        Teacher teacher = new Teacher("John", 1975, 1, "Mathematics", 5000);

        // calling parent class methods
        teacher.greet();
        teacher.doWork();

        // calling child class methods
        System.out.println("I teach " + teacher.getSubject());
        System.out.println("My salary is " + teacher.getSalary());

        
    }
}
