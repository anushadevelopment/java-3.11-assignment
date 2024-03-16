package sg.edu.ntu.javaspringtdd314;

public class InteractionNotFoundException extends RuntimeException  {
    InteractionNotFoundException(Long id) {
        super("Unable to find interactiong with id: "+ id + ",");
    }
}
