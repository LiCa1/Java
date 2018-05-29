//******************************************************************************
// Program:      - Team.java
//                 There 6 Java programs(classes) that work together to set up an 
//				   organization of players for a professional baseball francise.
//                 Team.java         - contains main(), creates & updates personel, 
//                 Personnel.java    - Sets up objects and populates players data,
//  			   Player.java       - provides variables and methods for types
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
// Team class   - contains main() , creates & updates personnel object
// Variables:   - Personnel personnel 
// Constructor: - none here, calls to Personnel constructor for personnel
// Methods:     - personnel.updateDay()
//******************************************************************************
public class Team {
    
    public static void main(String[] args) 
    {
       Personnel personnel  = new Personnel(); // declare object type Personel
       personnel.updateDay();				   // update the personnel on Team
       
    } // end of main()
    
} // end of Team class 
