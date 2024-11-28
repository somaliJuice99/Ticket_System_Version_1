public class Main {
    public static void main(String[] args) {
        // Create a TicketMeta object
        TicketMeta ticket1 = new TicketMeta(
                123477877L,                       // ID
                "Test_Ticket_1",                  // Title
                "Test Ticket Description",        // Description
                "non-admin",                      // Status
                "medium",                         // Priority
                "Abdullahi Ibrahim",              // Assigned To
                java.time.LocalDateTime.now(),    // Date Created
                java.time.LocalDateTime.now()     // Date Updated
        );

        // Print the ticket to verify object creation
        System.out.println(ticket1);
    }
}
