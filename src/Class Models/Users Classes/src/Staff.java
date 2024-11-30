public class Staff extends User{
    //May take some of these fields to the base class
    private String department;
    private String supervisor;
    private int ticketLimit;
    private double performanceScore;

    //Parameterized Constructor for Staff, passing in base class fields and methods
    public Staff (String name, String permissions, String position, String dateOfHire, String department, String supervisor, int ticketLimit, double performanceScore){

        super(name, permissions, position, dateOfHire);
        this.department = department;
        this.supervisor = supervisor;
        this.ticketLimit = ticketLimit;
        this.performanceScore = performanceScore;
    }

    //Mutator and Accessor methods for the Staff class
    public String getDepartment(){return department;}
    public void setDepartment(String department){this.department = department;}

    public String getSupervisor(){return supervisor;}
    public void setSupervisor(String supervisor){this.supervisor = supervisor;}

    public int getTicketLimit(){return ticketLimit;}
    public void setTicketLimit(int ticketLimit){this.ticketLimit = ticketLimit;}

    public double getPerformanceScore(){return performanceScore;}
    public void setPerformanceScore(double performanceScore) {this.performanceScore = performanceScore;}

    @Override
    public String toString() {
        return
                "\n Name = " + getName() +
                "\n Permissions = '" + getPermissions() + '\'' +
                "\n Position='" + getPosition() + '\'' +
                "\n Date Of Hire='" + getDateOfHire() + '\'' +
                "\n Department = '" + department + '\'' +
                "\n Supervisor = '" + supervisor + '\'' +
                "\n Ticket Limit = " + ticketLimit +
                "\n PerformanceScore = " + performanceScore;
    }

    public static void main(String[] args) {
        Staff test = new Staff("Peter Parker", "Staff", "Superhero: Spiderman", "10/29/1999", "The Avengers", "Tony Stark", 57, 99.99);

        System.out.println(test);
    }


}
