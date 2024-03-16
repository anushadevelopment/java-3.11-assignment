package sg.edu.ntu.springboot311assignment;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBoot311AssignmentApplication {

	NotificationService notificationService;
	public SpringBoot311AssignmentApplication(NotificationService notificationService){
		this.notificationService = notificationService;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot311AssignmentApplication.class, args);
	}

	//Channel channel;
    //Message message;

	 //= new NotificationService(channel,message);

	@PostConstruct
	public void init(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String to = scanner.nextLine();
		System.out.println("You have entered the email "+to);
		System.out.println("Read message: ");
		String message = scanner.nextLine();
		System.out.println("You have entered the message "+message);
		scanner.close();
		notificationService.setup(to, message);
		notificationService.send();
	}
}



	/*
		TODO:		
		- Create a @PostConstruct method to be executed after spring container has completed configuration.
		- Invite input using Scanner and System.in for value "to" and "message".
		- Set the input to setup(string, string) method in NotificationService.java.
		- Invoke send() method in Notification.java.
	*/
