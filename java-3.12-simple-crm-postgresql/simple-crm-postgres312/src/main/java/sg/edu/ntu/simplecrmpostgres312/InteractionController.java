package sg.edu.ntu.simplecrmpostgres312;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interactions")
public class InteractionController {
    private InteractionService interactionService;

    // @Autowired
    public InteractionController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    // CREATE
    @PostMapping("")
    public ResponseEntity<Interaction> createInteraction(@RequestBody Interaction interaction) {
        Interaction newInteraction = interactionService.createInteraction(interaction);
        return new ResponseEntity<>(newInteraction, HttpStatus.CREATED);
    }

    // READ (GET ALL)
    @GetMapping("")
    public ResponseEntity<ArrayList<Interaction>> getAllInteractions() {
        ArrayList<Interaction> allInteractions = interactionService.getAllInteractions();
        return new ResponseEntity<>(allInteractions, HttpStatus.OK);
    }

    // READ (GET ONE)
    @GetMapping("/{id}")
    public ResponseEntity<Interaction> getInteraction(@PathVariable Long id) {
        try {
            Interaction foundInteraction = interactionService.getInteraction(id);
            return new ResponseEntity<>(foundInteraction, HttpStatus.OK);
        } catch (InteractionNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Interaction> updateInteraction(@PathVariable Long id, @RequestBody Interaction interaction) {
        try {
            Interaction updatedInteraction = interactionService.updateInteraction(id, interaction);
            return new ResponseEntity<>(updatedInteraction, HttpStatus.OK);
        } catch (InteractionNotFoundException e) {
            // not found, return 404
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }                
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Interaction> deleteInteraction(@PathVariable Long id) {
        try {
            interactionService.deleteInteraction(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (InteractionNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
