package sg.edu.ntu.springpracticeexercise1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    
    private ArrayList<Expenses> expenses = new ArrayList<>();

    @PostMapping("/")
    public  ResponseEntity<Expenses> createExpenses(@RequestBody Expenses expense){
        try{
            expenses.add(expense);
            return new ResponseEntity<>(expense, HttpStatus.ACCEPTED);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }   
    }
    @GetMapping("/")
    public ResponseEntity <ArrayList<Expenses>> getAllExpenses(){
        try{
            return new ResponseEntity<>(expenses, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }
    
}
