package org.ram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		
		        // Create HashSet with values
	      Set<Integer> set = new HashSet<>();
		       set.add(10);
		      set.add(20);
		      set.add(30);
		       set.add(40);
		        set.add(50);
              set.add(60);
		       set.add(70);
		       set.add(80);
		      set.add(90);
		       set.add(10); // Duplicate value
	         set.add(20); // Duplicate value
	         set.add(30); // Duplicate value

		        // Create Iterator for the Set
		  Iterator<Integer> iterator = set.iterator();

		        // Iterate over the Set using while loop
        while (iterator.hasNext()) {
		            Integer value = iterator.next();
		            System.out.println("Value: " + value);
	        }
		
	}

}
