package Basics;

/**
 * Created by Konstantin on 31.08.2016.
 */
public class Name {
    private String firstName;
    private String lastName;

    public void setFirstName(String fName){
        this.firstName = fName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Name(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
}
