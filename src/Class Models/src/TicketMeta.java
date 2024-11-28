import java.time.LocalDateTime;

public class TicketMeta {
    // Member Variables
    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private String assignedTo;

    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    // Parameterized Constructor
    public TicketMeta(Long id, String title, String description, String status, String priority, String assignedTo, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.assignedTo = assignedTo;
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();
    }

    // Mutators (Getters and Setters)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; updateTimestamp(); }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; updateTimestamp(); }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; updateTimestamp(); }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; updateTimestamp(); }

    public String getAssignedTo() { return assignedTo; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; updateTimestamp(); }

    public LocalDateTime getDateCreated() { return dateCreated; }
    public LocalDateTime getDateUpdated() { return dateUpdated; }

    // Helper to Update Timestamp
    private void updateTimestamp() {
        this.dateUpdated = LocalDateTime.now();
    }

    // Override toString() for Debugging
    @Override
    public String toString() {
        return "TicketMeta{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}
