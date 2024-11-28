# Ticket_System_Version_1
One of my first indivdual projects that devises a ticketing system similar to Jira that incorporates a multitude of core software design principles and techniques.


....................................
11/27/2024
Class Hierarchy for Ticket System .v1
------------------------------------

Base Class: Ticket Meta
- Ticket ID
- Date Created
- Date Updated

Child Class : User - Ticket
- Username
- password
- role (Enum: Admin, User, etc)
- Constructor (enumerated type called userRole (Admin, user))

Child Class: Ticket - Ticket Meta 
- Title
- Description
- Priority (type Ticket priority that enumerated (low, med, high))
- status (type ticketStatus(open, in_progress, complete))
- assigned user (derived from user)

