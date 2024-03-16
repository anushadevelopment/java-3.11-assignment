package sg.edu.ntu.simplecrmpostgres312;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class InteractionServiceImpl implements InteractionService{

    private InteractionRepository interactionRepository;

    // @Autowired
    public InteractionServiceImpl(InteractionRepository interactionRepository) {
        this.interactionRepository = interactionRepository;
    }

    @Override
    public Interaction createInteraction(Interaction interaction) {
        return interactionRepository.save(interaction);
    }

    @Override
    public Interaction getInteraction(Long id) {
        return interactionRepository.findById(id).get();
    }

    @Override
    public ArrayList<Interaction> getAllInteractions() {
        return (ArrayList<Interaction>) interactionRepository.findAll();
    }

    @Override
    public Interaction updateInteraction(Long id, Interaction interaction) {
        // find from database
        Interaction interactionToUpdate = interactionRepository.findById(id).get();

        // update interactionToUpdate with details from client
        interactionToUpdate.setInteractionDate(interaction.getInteractionDate());
        interactionToUpdate.setRemarks(interaction.getRemarks());

        // save and return interaction
        return interactionRepository.save(interactionToUpdate);
    }

    @Override
    public void deleteInteraction(Long id) {
        interactionRepository.deleteById(id);
    }
    
}
