/** 
 * HW3 Assignment on Procedural Programming concerning scanning in information on MIDN.
 * @author MIDN Anna Klemeyer
 */

import java.util.*;

public class HW3 {
    
    /** 
     * @param s The scanner object which will take in information from the user. 
     * @return Mid A Mid object which holds information about the attributes of that MIDN.
     */
    public static Mid createMid(Scanner s) {
        /** Create an instance of Mid and then use the scanner object to get the necessary information from the user.
         * Then return the Mid object.
         */

        Mid aMid = new Mid();
        System.out.print("Alpha? ");
        aMid.alpha = s.next();
        System.out.print("First name? ");
        aMid.firstName = s.next();
        System.out.print("Last name? ");
        aMid.lastName = s.next();
        System.out.print("Company? ");
        aMid.company = s.nextInt();

        return aMid;
    }

    
    /** 
     * @param X A Mid object to read information about.
     */
    public static void printMid(Mid X) {
        /** Use system print to show the information about the Midn. */
        System.out.println(X.alpha + " " + X.lastName + " " + X.firstName + " " + X.company);
    }

    
    /** 
     * @param args The default String[] in a main function for command line arguments
     */
    public static void main(String[] args) {
        /** Create a scanner object in order to get the number of Midn from the user.  */
        Scanner sc = new Scanner(System.in);
        System.out.print("How many mids? ");
        int count = sc.nextInt();

        /** Create an array of Mid objects and then fill it using the createMid() function. */
        Mid[] mids = new Mid[count];
        for(int i = 0; i < count; i++) {
            mids[i] = createMid(sc);
        }

        /** Ask the user what company, and then use that integer to print out only certain midn. */
        System.out.print("What company would you like to print out? ");
        int c = sc.nextInt();
        for(int i = 0; i < count; i++) {
            if (mids[i].company == c) {
                printMid(mids[i]);
            }
        }
    }
}