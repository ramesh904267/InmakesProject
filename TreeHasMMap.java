package org.ram;

import java.util.Map;
import java.util.TreeMap;

public class TreeHasMMap {

	    public static void main(String[] args) {
		char[] keys = {'!', '@', '#', '$', '%', '^', '&', '(', '*'};
		
    int[] values = {10, 20, 30, 40, 50, 60, 10, 50, 40};

        // Creating a TreeMap to store the key-value pairs
     TreeMap<Character, Integer> treeHashMap = new TreeMap<>();

        // Populating the TreeMap with the key-value pairs
             for (int i = 0; i < keys.length; i++) {
     treeHashMap.put(keys[i], values[i]);
        }

        // Accessing the key-value pairs using an enhanced while loop
    for (Map.Entry<Character, Integer> entry : treeHashMap.entrySet()) {
    	
            System.out.println(entry.getValue() + " " + entry.getKey());
		
        }

	}

}
