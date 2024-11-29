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

....................................
11/29/2024
Adding the Users Class to better modify and manage Ticket objects
------------------------------------
In this stage of the project, I decided to create a series of classes for the users of this ticketing system. The users have different priviledges depending
on their level (viewer, staff, manager, admin). Their title corresponds to what fields and methods they get access to. Ultimately, the user class will serve as a template for general fields and methods all the other users have access to. These range from:
- viewing tickets
- generating reports
- access settings
- etc.

Here is a generla map of the classes I will be creating for the users:
- user 
  - viewer (may be redundant to the base class since they have the least amount of permissions)
  - staff
  - manager
  - admin

After this, the plan would be to refine the Ticket meta class and the sub class counterparts to allow the user objects to modify the ticket instances instead of them being isolated.


