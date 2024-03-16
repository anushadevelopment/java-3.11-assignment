package sg.edu.ntu.didemospring311;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TeacherController {
    
    // @Autowired
    // private MathTeacher mathTeacher;
    private ScienceTeacher scienceTeacher;
    private MathTeacher mathTeacher;
    private CodingTeacher codingTeacher;
    private AlgorithmTeacher algorithmTeacher;

    @Autowired 
    private DatabaseTeacher databaseTeacher;

    @Autowired
    private EmailService emailService;

    //Constructor dependency injections

    @Autowired
    public TeacherController(MathTeacher mathTeacher, CodingTeacher codingTeacher){
        this.mathTeacher = mathTeacher;
        this.codingTeacher = codingTeacher;
    }


    //Setter dependency injection
    @Autowired
    public void setScienceTeacher(ScienceTeacher scienceTeacher, AlgorithmTeacher algorithmTeacher){
        this.scienceTeacher = scienceTeacher;
        this.algorithmTeacher = algorithmTeacher;
    }
    


    @GetMapping("/math-teacher")
    public String mathTeacher(){
        return mathTeacher.teach();
    }

    @GetMapping("/science-teacher") 
    public String scienceTeacher(){
        emailService.send("Hello Science teacher");
        return scienceTeacher.teach();
    }

    @GetMapping("/coding-teacher")
    public String codingTeacher()
    {
        return codingTeacher.teach();
    }

    @GetMapping("/algorithm-teacher")
    public String algorithmTeacher()
    {
        return algorithmTeacher.teach();
    }

    @GetMapping("/database-teacher")
    public String databaseTeacher(){
        return databaseTeacher.teach();
    }

    }
    
