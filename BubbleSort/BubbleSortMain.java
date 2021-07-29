/**********************************************************************************************************************************************************************
 *
 * A - Desc -> Reads in integers prints them in sorted order using Bubble Sort
 * B - I/P -> read in the list ints
 * C - O/P -> Print the Sorted List
 *
 * @Author : Immanuvel Jeeva
 * @Since  : 29-07-2021
 *
 *********************************************************************************************************************************************************************/
package BubbleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read data from the file
        ReadFile read = new ReadFile();
        ArrayList<Integer> dataArray = read.readFile();

        //convert the arraylist into array to pass it to the generic class
        Integer[] array = new Integer[dataArray.size()];
        array = dataArray.toArray(array);

        //call the bubble sort method
        BubbleSortImplementation bubbleSort = new BubbleSortImplementation(array);
        bubbleSort.sort();
    }
}

