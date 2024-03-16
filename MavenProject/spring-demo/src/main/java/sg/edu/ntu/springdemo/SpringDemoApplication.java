package sg.edu.ntu.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(SpringDemoApplication.class);

	public static void main(String[] args) {
		logger.info("🟢 Starting MySpringbootProjectApplication");
		logger.warn("🟠 Test Warning");
		logger.error("🔴 Error Warning");
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
