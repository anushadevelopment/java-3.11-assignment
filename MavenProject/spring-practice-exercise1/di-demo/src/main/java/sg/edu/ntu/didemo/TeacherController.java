package sg.edu.ntu.didemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TeacherController {
    // private MathTeacher mathTeacher = new MathTeacher();
    // private ScienceTeacher scienceTeacher = new ScienceTeacher();
    
    // @Autowired
    private ScienceTeacher scienceTeacher;

    private MathTeacher mathTeacher;

    private CodingTeacher codingTeacher;

    private AlgorithmsTeacher algorithmsTeacher;

    private DatabaseTeacher databaseTeacher;

    @Autowired
    public TeacherController(ScienceTeacher scienceTeacher) {
        this.scienceTeacher = scienceTeacher;
    }

    @Autowired
    public void setMathTeacher(MathTeacher mathTeacher) {
        this.mathTeacher = mathTeacher;
    }

    @GetMapping("/math-teacher")
    public String mathTeacher() {
        return mathTeacher.teach();
    }
    
    @GetMapping("/science-teacher")
    public String scienceTeacher() {
        return scienceTeacher.teach();
    }

    @GetMapping("/coding-teacher")
    public String codingTeacher() {
        return codingTeacher.teach();
    }
    
    @GetMapping("/algorithms-teacher")
    public String algorithmsTeacher() {
        return algorithmsTeacher.teach();
    }

    @GetMapping("/database-teacher")
    public String databaseTeacher() {
        return databaseTeacher.teach();
    }
}
