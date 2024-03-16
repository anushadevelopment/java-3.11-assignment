package sg.edu.ntu.didemospring311;

import org.springframework.stereotype.Component;

import lombok.extern.apachecommons.CommonsLog;

@Component
public class AlgorithmTeacher {
    public String teach(){
        return "Teaching Algorithm";
    }
}
