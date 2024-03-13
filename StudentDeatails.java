package org.ram;

import java.util.HashMap;
import java.util.Map;

public class StudentDeatails {

public static void main(String[] args) {
		 // Creating a Map to store student details
        Map<String, String> studentMap = new HashMap<>();

        // Adding student details to the map
        studentMap.put("stdId", "1");
        
        studentMap.put("stdName", "Ramesh S");
     studentMap.put("stdPhone", "766612193");
    studentMap.put("address", "No.234, Kallakurichi");
       studentMap.put("dob", "09/12/1997");
     studentMap.put("email", "ramesh904267@gmail.com");
        studentMap.put("gender", "male");

        // Retrieving and printing student details using keys
        System.out.println("Student ID: " + studentMap.get("stdId"));
     System.out.println("Student Name: " + studentMap.get("stdName"));
      System.out.println("Student Phone: " + studentMap.get("stdPhone"));
       System.out.println("Student Address: " + studentMap.get("address"));
  System.out.println("Student DOB: " + studentMap.get("dob"));
       System.out.println("Student Email: " + studentMap.get("email"));
      System.out.println("Student Gender: " + studentMap.get("gender"));

	}

}
