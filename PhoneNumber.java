package org.ram;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter your phone number: 923456777888                       ");
	        String phoneNumber = scanner.nextLine();
	        
	        if (phoneNumber.length() != 10) {
	            System.out.println("10 digit phone Number:9234567778");
	        } else {
	            System.out.println("Phone number:9234567778");
	        }
	        
	       

	}

}
