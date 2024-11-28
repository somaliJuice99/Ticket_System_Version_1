import java.time.LocalDateTime;
import java.util.List;

public class BugTicket extends TicketMeta {
    // Fields Specific to BugTicket
    private String severity; // Bug severity
    private List<String> stepsRepeatable; // Steps to reproduce the bug

    // Derived Class Parameterized Constructor
    public BugTicket(Long id, String title, String description, String status, String priority, String assignedTo,
                     LocalDateTime dateCreated, LocalDateTime dateUpdated, String severity, List<String> stepsRepeatable) {
        // Call Parent Constructor
        super(id, title, description, status, priority, assignedTo, dateCreated, dateUpdated);

        // Initialize BugTicket-Specific Fields
        this.severity = severity;
        this.stepsRepeatable = stepsRepeatable;
    }

    // Mutators (Getters and Setters)

    // Severity
    public String getSeverity() {
        return severity;
    }
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    // Steps Repeatable
    public List<String> getStepsRepeatable() {
        return stepsRepeatable;
    }
    public void setStepsRepeatable(List<String> stepsRepeatable) {
        this.stepsRepeatable = stepsRepeatable;
    }

    // Override toString() for Debugging
    @Override
    public String toString() {
        return super.toString() +
                ", BugTicket{" +
                "severity='" + severity + '\'' +
                ", stepsRepeatable=" + stepsRepeatable +
                '}';
    }
}
