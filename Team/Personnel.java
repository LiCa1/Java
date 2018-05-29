//******************************************************************************
// Program:      - Personnel.java
//                 There 6 Java programs(classes) that work together to set up an 
//		   organization of players for a professional baseball francise.
//                 Team.java         - contains main(), creates & updates personel, 
//                 Personnel.java,   - Sets up objects and populates players data,
//  	           Player.java,      - provides variables and methods for types
//                                     of players which can be any of the 3 bellow.
//                 Pitcher.java      - inherits from the Player class,  
//		   Regular.java      - inherits from the Player class,  
//		   MinorLeaguer.java - inherits from the Player class.  
//           
// Author:       - Lisa Caron
// Course:       - C490 Java
// Assignment:   - Program 4
// Date:         - 6/29/14
//******************************************************************************
//package Team;
import java.util.*;
//******************************************************************************
// Personnel class - Acts as a "container class" for objects.
//                   Sets up and populates class objects (3 each)
//                   Pitcher, Regular, MinorLeaguer. 
// Variables:   - Player [] playerList 
// Constructor: - Personnel() - fills up 9 objects with data
// Methods:     - updateDay() - runs through each player updates and displays
//******************************************************************************
 public class Personnel {
    
    Player [] playerList;
    // Sets up the Personnel members that are Players on the Team
    //  (3 each of 3 different types.)
    public Personnel ()
    {
        playerList = new Player[9]; // initialize the array of objects

        //create 9 objects and put each Players - name, address, phone, bats, 
        //                                        throws, and years in its array
        //       3 will be MinorLeaguer with an additional "affiliate" attribute.
        //       3 will be Regular	with an additional "position"  attribute.
        //       3 will be Pitcher	with an additional "role"      attribute.    

        playerList [0] = new MinorLeaguer ("Alan Alexan", "123 Main Line Ave",
                                            "555-0469", "L","L", 1, "South Bend");
        playerList [1] = new MinorLeaguer ("Bobby Green", "834 Main Lione St",
                                            "555-0429", "L","L", 2, "Chicago");
        playerList [2] = new MinorLeaguer ("Chris Paper", "456 Offnyers Lyne",
                                            "555-0101", "L","L", 3, "Honolulu");
        playerList [3] = new Regular      ("Doug E Hose", "789 Off Da Rocker",
                                            "555-0000", "L","L", 4, "Short Stop");
        playerList [4] = new Regular      ("Erin Blahba", "439 Mainiers Line",
                                            "555-0479", "L","L", 5, "Outfield");
        playerList [5] = new Regular      ("Frank Stien", "678 Fifths Street",
                                            "555-0690", "L","L", 6, "3rd Base");
        playerList [6] = new Pitcher      ("Greg Flakus", "987 Sudsian Blvd.",
                                            "555-8374", "L","L", 7, "Reliever");
        playerList [7] = new Pitcher      ("Henry Eight", "278 Dudszien Lane",
                                            "555-7282", "L","L", 8, "Reliever");
        playerList [8] = new Pitcher      ("Issac Asmov", "321 Bubstion Lane",
                                            "555-7283", "L","L", 9, "Starter");
    }
    
    // method updateDay()
    // runs through and updates each player on the team 1 by 1.
    // then displays results of all player updates for the year.
    public void updateDay()
    {
        String result;
        for (Player playerList1 : playerList) {
            System.out.println ("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println ("------------------------------------");
            System.out.println(playerList1);// display this players info
            result = playerList1.update();  // polymorphic update Player
            System.out.println ("------------------------------------");
	    System.out.println ("-- "+playerList1.name+" has been updatted --");
            System.out.println ("------------------------------------");
            System.out.println (result); // display this result of update
            System.out.println ("------------------------------------");
        }
	System.out.println     ("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println     ("------------------------------------");
        System.out.println     ("      Team Has Been Updated:        ");
        System.out.println     ("------------------------------------");
	System.out.println     ("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	System.out.println     ("------------------------------------");
        
         // display all results together after update 1 by 1
        for (Player playerList1 : playerList) {
            System.out.println(playerList1);
            System.out.println ("------------------------------------");
        }
    } // end of method updateDay()
    
 } // end of Personnel class
 //******************************************************************************  
