/** ****************************************************************************
 * DateProcessing.java
 * Kevin Bell
 *
 * This driver program changes number months to letter/name months
 **************************************************************************** */
package dateprocessing;

import java.util.Scanner;

public class DateProcessing {

    public static void main(String[] args) {
        System.out.println("Ch 15 Date Processing Project by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        String dateStr;
        Date date = new Date();
        do {
            System.out.print("Enter a date in format mm/dd (\"q\" to quit): ");
            dateStr = computerKeyboardInput.next();
            if ("q".equalsIgnoreCase(dateStr)) {
                break;
            } else {
                date.Date(dateStr);
            } // end if/else condition
        } while (!dateStr.equalsIgnoreCase("q")); // end while loop
    } // end main method
} // end DateProcessing class
