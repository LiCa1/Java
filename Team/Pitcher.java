//******************************************************************************
// Program:      - Pitcher.java
//                 There 6 Java programs(classes) that work together to set up an 
//				   organization of players for a professional baseball francise.
//                 Team.java         - contains main(), creates & updates personel, 
//                 Personnel.java,   - Sets up objects and populates players data,
//  			   Player.java,      - provides variables and methods for types
//                                     of players which can be any of the 3 bellow.
//                 Pitcher.java      - inherits from the Player class,  
//				   Regular.java      - inherits from the Player class,  
//				   MinorLeaguer.java - inherits from the Player class.  
//
// Author:       - Lisa Caron
// Course:       - C490 Java
// Assignment:   - Program 4
// Date:         - 6/29/14
//******************************************************************************
//package Team;
import java.util.*;
//******************************************************************************
// Pitcher class - inherits from the Player class 
//                 and keeps track of the name of the player’s Pitcher role.
// Inherits variables from Player - name, address, phone, bats,throwS, num_years
// Variables:   - String role 
// Constructor: - 1 uses all inherited variables and adds Pitcher role.
// Methods:     - setRole(), getRole()
//              - update()   - overrides method update()   in Player
//              - toString() - overrides method toString() in Player
//******************************************************************************
public class Pitcher extends Player{
    
    private String role;  // instance variable 

    //consructor
    public Pitcher(String name, String address, String phone, 
                   String bats, String throwS,  int num_years, String role)
    {
        super(name, address, phone, bats, throwS, num_years);
        this.role = role;
    }
    
    //set role
    public void setRole(String role)
    {
        this.role = role;
    }
    
    //get role
    public String getRole()
    {
        return role;
    }
    
    // method toString() - display for Pitcher class
    // Strings all player info together and returns results
    // as a string for Pitcher object
    public String toString()
    {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone + "\n";
        result += "Bats: " + bats + "\n";
        result += "Throws: " + throwS + "\n";
        result += "Years: " + num_years + "\n";
        result += "Role: " + role;
        return result;
    }  // end method toString
    
    //overide abstract method update in Player
    // @Override
    public String update()
    {
        super.num_years++;      // increment years in player(s) record
        
        // prompt user to edit Pitcher players role(s)
        System.out.println ("------------------------------------");
        System.out.println ("- Has " + name + " changed roles?");
        System.out.print   ("- Enter 'y' if yes: \n-- and any other key for no: ");
        
        Scanner input = new Scanner(System.in);
        String result;          // instance variable to hold contents of string.
        result = input.next();  // read in user-entered string.
                 
        if(!result.equals("y")){// if user does not want to edit just return.
            System.out.print("- You entered other than 'y' for yes."+
                            "\n-- Only years will be updated. \n");
            return toString();
        }
        else{                   // else read in change and set new role.               
            System.out.print("- Enter new role (Starter or Reliever): ");
            result = input.next();
            setRole(result);
        } 
      
        return toString();      // return changed role
    } // end method update

} // end Pitcher class

