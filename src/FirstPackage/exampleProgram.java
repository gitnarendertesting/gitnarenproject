package FirstPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class exampleProgram {

	public static void main(String[] args) {

		// Custom string input
        String str = "geeksforgeeks";
       
        // Converting string into an array for computation
        char arr[] = str.toCharArray();
 
        // Nested loops for comparison of characters
        // in above character array
       
        char temp;
 
        int i = 0;
        while (i <= arr.length) {
            int j = i + 1;
            while (j <= arr.length) {
                if (arr[j] < arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
 
        // By now loop is done means we have
        // iterated the whole array
        System.out.println(arr);

        
        System.out.println("updating example program at local 1");
        
        System.out.println("Updating example program at local 2");
        
        System.out.println("Updating example program at local 3");
        
        System.out.println("Updating example program at local 4");
        


        System.out.println("Updating example program at master side 1");
	System.out.println("Updating example program at master side 2");
	
	System.out.println("Updating example program at master side 3");
	System.out.println("Updating example program at master side 4");

       System.out.println("only one change in example program");

		

	}

}
