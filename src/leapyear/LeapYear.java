package leapyear;

import java.util.Scanner;

/**
 *
 * @author promasterguru
 */
public class LeapYear {
    /**
     * Determines whether the given year is a leap year
     * @param year
     * @return valid
     */
    boolean isLeapYear(int year){
        boolean valid = false;
        return valid;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner class to accept year as keyboard input
        Scanner scanner = new Scanner(System.in);
        //Instantiate the LeapYear class
        LeapYear leapYear = new LeapYear();
    
        int year = 0;
        boolean result = false;
        
        
        //Prompt user to enter year and validate whether its a leap year
        while(true){
            System.out.print("Enter year or -1 to quit: ");
            year = scanner.nextInt();
            if(year == -1){
                break;
            }
            else if(year < 400){
                System.out.println("Invalid year!");
            }
            else{
                result = leapYear.isLeapYear(year);
                if(result){
                    System.out.println(year + " is a leap year");
                }
                else{
                    System.out.println(year + " is not a leap year");
                }
            }
        }
    }
    
}
