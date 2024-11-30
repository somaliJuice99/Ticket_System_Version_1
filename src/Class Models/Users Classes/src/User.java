import java.util.HashSet;
import java.util.Scanner;

public class User {
    private String name;
    private String permissions;
    private String position;
    private String dateOfHire;

    //Parameterized Constructor for User
    public User(String name, String permissions, String position, String dateOfHire){
        this.name = name;
        this.permissions = permissions;
        this.position = position;
        this.dateOfHire = dateOfHire;

    }
    //Default Constructor
    public User(){
        Scanner userObj = new Scanner(System.in);

        System.out.println("Enter the name of the user: ");
        String n = userObj.nextLine();
        setName(n);

        System.out.println("Enter the employee's employee permission status: ");
        String per = userObj.nextLine();
        setPermissions(per);

        System.out.println("Enter the employee's occupation status: ");
        String p = userObj.nextLine();
        setPosition(p);

        System.out.println("Enter the employee's date of hire: ");
        String doh = userObj.nextLine();
        setDateOfHire(doh);

    }

    //Mutator and Accessor Methods
    public String getName (){return name;}
    public void setName(String name) {this.name = name;}

    public String getPermissions (){return permissions;}
    public void setPermissions(String permissions) {this.permissions = permissions;}

    public String getPosition(){return position;}
    public void setPosition(String position){this.position = position;}

    public String getDateOfHire (){return dateOfHire;}
    public void setDateOfHire(String dateOfHire) {this.dateOfHire = dateOfHire;}

    public static void main(String[] args){
        User test = new User();

        System.out.println(test.getDateOfHire());
        System.out.println(test.getPosition());
        System.out.println(test.getPermissions());
        System.out.println(test.getName());
    }
}
