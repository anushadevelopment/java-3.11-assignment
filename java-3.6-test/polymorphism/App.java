package polymorphism;

import java.net.Socket;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {
        Person tonyShark = new Person("Tony Sharkl", 1975);
        tonyShark.greet();
        tonyShark.doWork();

        Student student = new Student(1, "Computer Science", 2022);
        student.setName("Toney");
        student.greet();
        student.doWork();
        
        System.out.println("I am studying " + student.getCourse());
        student.addGrade(100.00);
        student.addGrade(97.00);
        System.out.println("Average : " +student.getAverageGrade());

        Student student2 = new Student("Robert", 1995, 2, "Lawyer", 2022);

        student2.greet();
        student2.doWork();
        student2.attendClass();

        System.out.println("I am studying " + student.getCourse());
        student.addGrade(100.00);
        student.addGrade(97.00);
        System.out.println("Average : " +student.getAverageGrade());


        Teacher teacher = new Teacher("john", 1980, 1, "computer Science", 2022);
        teacher.greet();
        teacher.doWork();
        teacher.doWork("corrections");
        
        System.out.println("I teach " + teacher.subject);
        System.out.println("My Salary  " + teacher.getSalary());


        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(1,2,3));
        System.out.println(calculator.add(1.2, 2.2));


    }
   
    

    

    
}
