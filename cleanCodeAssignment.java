mport java.util.*;
import java.io.*;

public class CleanCodeAssignment {
    
    //Function for finding index of Array Elements with respect to their position in sorted form
    static int[] convertArray(int[] arrayElements, int sizeOfArray)
    {
        int[] result = new int[sizeOfArray];
        int currentPosition = 0;
       
        for(int indexOfArray=0;indexOfArray<sizeOfArray;indexOfArray++) 
        {
            int minimumElement = Integer.MAX_VALUE;
            int index = -1;

            // Find the minimum element and keep its position of occurrence
            for(int position=0;position<sizeOfArray;position++) 
            {
                if(minimumElement > arrayElements[position]) 
                {
                    minimumElement = arrayElements[position];
                    index = position;
                }
            }

            // Update the result at minimum index element with new Position
            result[index] = currentPosition;

            // Increment the new position
            currentPosition++;

            // Update the original element at current minimum element with maximum value possible, so that it won't be minimum in further iteration
            arrayElements[index] = Integer.MAX_VALUE;
        }

        return result;
    }

    //Function for Printing Array Indexes 
    static void printArray(int[] result, int sizeOfArray)
    {
        for(int printIndex=0;printIndex<sizeOfArray;printIndex++) 
        {
            System.out.print(result[printIndex] + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sizeOfArray,indexOfArray;
       
        System.out.println("Enter size of array: ");
        sizeOfArray = sc.nextInt();
       
        int arrayElements[]=new int[sizeOfArray];
        
        //User input for Array
        System.out.println("Enter the array elements: ");
        for(indexOfArray=0; indexOfArray <sizeOfArray; indexOfArray++)
        {
            arrayElements[indexOfArray]=sc.nextInt();
        }
        
        //Calling Function for Resultant Array
        int[] result = convertArray(arrayElements, sizeOfArray);

        System.out.println("\nOutput : ");
        printArray(result, sizeOfArray);
    }
}
