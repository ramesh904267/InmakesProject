package org.ram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapkeyValue {

	public static void main(String[] args) {
		 // Create HashMap with keys and values
     HashMap<Integer, String> hashMap = new HashMap<>();
          hashMap.put(10, "java");
        hashMap.put(20, "sql");
            hashMap.put(30, "oops");
        hashMap.put(40, "Sql");
         hashMap.put(50, "oracle");
        hashMap.put(60, "DB");
        hashMap.put(10, "selenium"); // Overwrites the previous value for key 10
        hashMap.put(20, "psql"); // Overwrites the previous value for key 20
            hashMap.put(40, "Hadoop"); // Overwrites the previous value for key 40

        // Iterate over HashMap using while loop
            Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
    while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
          System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
		
		
		
	}

}
