package org.ram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CommonValueFinder {

	public static void main(String[] args) {
		
		 // Input lists
   List<Integer> list1 = Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 80);
        
        // Create HashSet instances from the lists
      HashSet<Integer> set1 = new HashSet<>(list1);
          HashSet<Integer> set2 = new HashSet<>(list2);
        
        // Find common values by retaining elements common to both sets
  set1.retainAll(set2);
        
        // Print the common values
           System.out.println("Common values: " + set1);

	}

}
