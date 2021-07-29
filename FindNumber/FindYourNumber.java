/**********************************************************************************************************************************************************************
 *
 * A - Desc -> takes a command-line argument N, asks you to think of a number
 *     between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
 * B - I/P -> the Number N and then recursively ask true/false if the number is between a high and low value
 * C - Logic -> Use Binary Search to find the number
 * D - O/P -> Print the intermediary number and the final answer
 *
 * @Author : Immanuvel Jeeva
 * @Since  : 29-07-2021
 *
 *********************************************************************************************************************************************************************/
package FindNumber;

import java.util.Scanner;
class FindYourNumberMain {

    static Scanner input = new Scanner(System.in);

    public static void searchNumber(int upperBound) {
        int low = 0;
        int high = upperBound ;

        while (low <= high) {
            int midVal = (low + high) / 2;
            System.out.println("Press 0 if the number is "+midVal);
            System.out.println("Press 1 if the number is between " + low + " to " + midVal);
            System.out.println("Press 2 if the number is between " + (midVal+1) + " to " + high);

            int choice = input.nextInt();

            if(choice == 0) {
                System.out.println("\nGot the number "+midVal);
                break;
            }
            else if(choice == 1) {
                high = midVal;
            }

            else if(choice == 2) {
                low = midVal + 1;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the MaximumNumber to Find the element: ");
        int n = input.nextInt();

        int upperBound = (int) Math.pow(2, n);
        System.out.println("upperBound = "+upperBound);

        System.out.println("Think a number between 0 to " +(upperBound));
        searchNumber(upperBound);
    }
}
