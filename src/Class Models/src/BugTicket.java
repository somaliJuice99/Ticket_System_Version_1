import java.time.LocalDateTime;
import java.util.List;


public class BugTicket extends TicketMeta {
    //Fields Specific to the BugTicket class
    private String severity;
    private String description;

    //Local Date Time fields for creation date and updated date
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    //List of steps that can be repeated to create bugs
    private List<String> stepsRepeatable;


    public BugTicket(String title, String description, String severity, List<String> stepsRepeatable) {
        super(title);
        this.description = description;
        this.severity = severity;
        this.stepsRepeatable = stepsRepeatable;
    }
}



public void main(){

}

