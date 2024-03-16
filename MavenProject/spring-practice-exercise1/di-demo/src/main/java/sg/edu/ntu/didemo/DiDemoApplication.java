package sg.edu.ntu.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiDemoApplication.class, args);
	}

	// // create a new instance of ScienceTeacher()
	// ScienceTeacher scienceTeacher = new ScienceTeacher();

	// MathTeacher mathTeacher = new MathTeacher();

	// // inject instance into the constructor
	// TeacherController teacherController = new TeacherController(scienceTeacher);

	// teacherController.setMathTeacher(mathTeacher);
}
