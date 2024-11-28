import java.time.LocalDateTime;

public class TicketMeta {
    //Member Variables or fields to be passed in the Ticket Meta Constructor and Object Instances
    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private String assignedTo;

    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    //constructors
    public TicketMeta(Long id, String title, String description, String status, String priority, String assignedTo, LocalDateTime dateCreated, LocalDateTime dateUpdated){
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.assignedTo = assignedTo;

        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    //mutator functions modifying or printing / receiving field values
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        updateTimestamp();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        updateTimestamp();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        updateTimestamp();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
        updateTimestamp();
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        updateTimestamp();
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    // Helper to update timestamps
    private void updateTimestamp() {
        this.dateUpdated = LocalDateTime.now();
    }

    // Overriding toString() for better debugging
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", createdAt=" + dateCreated +
                ", updatedAt=" + dateUpdated +
                '}';
    }




    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}