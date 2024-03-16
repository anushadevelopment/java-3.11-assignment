package sg.edu.ntu.didemospring311;

public class EmailService {

    private String replyTo;

    public void send(String message){
        System.out.println("Sending mail ...");
        System.out.println("Message : "+message);
        System.out.println("reply to : "+this.replyTo);
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }
    
}
