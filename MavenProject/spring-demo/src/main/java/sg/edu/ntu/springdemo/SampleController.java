package sg.edu.ntu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    
    @Value("${spring.application.name:Default Spring Boot Application}")
    private String appName;

    @Value("${server.port:8080}")
    private String port;

    @GetMapping("/app-info")
    public String getAppInfo() {
        return "App " + appName + " is running on port: " + port;
    }
    
	@Autowired
	SampleItem item;

	@GetMapping("/item")
	public SampleItem getItem() {
		item.setId(1);
		item.setName("Apple");
		item.setPrice(1.99);
		item.setDesc("A Red Apple");
		return item;
	}


    @GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/greet")
	public String greet(@RequestParam(defaultValue = "World") String name, @RequestParam(defaultValue = "Unknown") String role) {
		return "Hello " + name + "! You are a " + role + "!";
	}

	@GetMapping("/users/{id}")
	public String getUser(@PathVariable int id) {
		return "User ID: " + id;
	}
	
	@GetMapping("/products")
    public String products(@RequestParam(required = false) String search) {
		if (search == null){
        	return "This is the product page";
		} else {
			return "You have searched for " + search + ".";
		}
    }

	@GetMapping("/products/{id}")
    public String findProductsById(@PathVariable int id) {
        return "You have requested for product with id: " + id + "."; 
    }

	@GetMapping("/products/search")
    public String searchProducts(@RequestParam String search){
        return "You have searched for " + search + ".";
    }
}
