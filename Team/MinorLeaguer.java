//******************************************************************************
// Program:      - MinorLeaguer.java
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
// MinorLeaguer class - inherits from the Player class and keeps track of the 
//                      name of the player’s minor league affiliate.
// Inherited variables from Player - name, address, phone, bats,throwS, num_years
// Variables:   - String affiliate 
// Constructor: - Uses all inherited variables and adds Minor Leaguer affiliate.
// Methods:     - setAffiliate(), getAffiliate()
//              - update()   - overrides method update()   in Player
//              - toString() - overrides method toString() in Player
//******************************************************************************
public class MinorLeaguer extends Player {
    
    private String affiliate;  // instance variable 
    
    //consructor
    public MinorLeaguer(String name, String address, String phone, String bats,
                        String throwS, int num_years, String affiliate)
    {
        super(name, address, phone, bats, throwS, num_years);
        this.affiliate = affiliate;
    }
    
    //set affiliate
    public void setAffiliate(String affiliate )
    {
        this.affiliate = affiliate;
    }
    
    //get affiliate
    public String getAffiliate()
    {
        return affiliate;
    }
    
    // method toString() - display for MinorLeaguer class
    // Strings all player info together and returns results
    // as a string for MinorLeaguer object
    //@Override
    public String toString()
    {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone + "\n";
        result += "Bats: " + bats + "\n";
        result += "Throws: " + throwS + "\n";
        result += "Years: " + num_years + "\n";
        result += "Team: " + affiliate;
        return result;
    } // end method toString
    
    //overide abstract method update in Player
    //@Override
    public String update()
    {
        super.num_years++;       // increment years in player(s) record
        
        // prompt user to edit MinorLeaguer players position(s)
        System.out.println ("------------------------------------");
        System.out.println ("- Has "+ name + " changed teams? ");
        System.out.print   ("- Enter 'y' if yes: \n-- and any other key for no: ");
        
        Scanner input = new Scanner(System.in);
        String result;          // instance variable to hold contents of string.
	    result = input.next();  // read in user-entered string

        if(!result.equals("y")){// if user does not want to edit just return.
            System.out.print("- You entered other than 'y' for yes."+
                            "\n-- Only years will be updated. \n");
            return toString();
        }
		else{                   // else read in change and set new affiliate.            
            System.out.print("- Enter new team: ");
			result = input.next();
			setAffiliate(result);

			//while (!result.equal("\n") //(" "){
			//if (!input.hasNext()){
			//	//result += (" " + input.next());  // if teams has more than 1 word
			//	setAffiliate(result);
			//}
			//else{
			//	setAffiliate(result);
			//}
        }
        return toString();      // return changed affiliate
    } // end method update
    
    
    
} // end MinorLeager class
