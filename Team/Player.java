//******************************************************************************
// Program:      - Player.java
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
// Player class - It is an abstract class.
//                Variables are inherited by MinorLeaguer, Pitcher and Regular.
//                Methods   are overidden in MinorLeaguer, Pitcher and Regular.  
//                Relevant information is the name, address, phone number, 
//                bats (Lor R), throws (L or R) and the number of years 
//                in the organization.
// Variables:   - protected String name, address, phone, bats, throwS
//                protected int num_years 
// Constructor: - public Player()
// Methods:     - public String toString()
//                public abstract String update();

//******************************************************************************
public abstract class Player {
    
    protected String name;    // instance variable
    protected String address; // instance variable
    protected String phone;   // instance variable
    protected String bats;    // instance variable
    protected String throwS;  // instance variable
    protected int num_years;  // instance variable
    
    // constructor sets up a Player using data provided in Personnel class
    public Player(String pname, String paddress, String pphone, 
                  String pbats, String pthrowS, int pnum_years)
    {
        this.name = pname;
        address = paddress;
        phone = pphone;
        bats = pbats;
        throwS = pthrowS;
        num_years = pnum_years;
        
    } // end of Player constructor
    
    // method toString() 
    // is overriden in the MinorLeaguer, Pitcher and Regular classes
    public String toString()
    {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone + "\n";
        result += "Bats: " + bats + "\n";
        result += "Throws: " + throwS + "\n";
        result += "Years: " + num_years;
        return result;
    }  // end method toString
    
    // abstract String update()
    // Derived classes define the update method for each player type
    // is overriden in the MinorLeaguer, Pitcher and Regular classes    
    public abstract String update();

} // end of Player class


