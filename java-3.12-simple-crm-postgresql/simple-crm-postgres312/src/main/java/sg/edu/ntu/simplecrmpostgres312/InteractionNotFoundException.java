package sg.edu.ntu.simplecrmpostgres312;

public class InteractionNotFoundException extends RuntimeException  {
    InteractionNotFoundException(String id) {
        super("Unable to find interactiong with id: "+ id + ",");
    }
}
