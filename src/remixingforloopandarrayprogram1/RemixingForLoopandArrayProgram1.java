/*
 * March 13, 2020
 * Erika Graham
 * for loops and arrays program 1
 */

package remixingforloopandarrayprogram1;

import java.util.Scanner;

public class RemixingForLoopandArrayProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in);

        int[] numbers = new int[20];    //array declared, capacity is 20
        int total = 0;  //variable to sum the values
        //prompt to the user
        System.out.println("Enter twenty integers and they will be added together:");
        for (int i = 0; i <= 19; i = i + 1) {    //for loop to let the user enter 20 values
            numbers[i] = keyedInput.nextInt();  //i range changed to 19
        }

        for (int i = 0; i <= 19; i = i + 1) {    //for loop to sum the values
            total = total + numbers[i];
        }

        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
