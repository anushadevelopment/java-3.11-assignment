package sg.edu.ntu.springpracticeexercise1;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Expenses {
    private String id;
    private String description;
    private double amount;
    private String category;


    
}
