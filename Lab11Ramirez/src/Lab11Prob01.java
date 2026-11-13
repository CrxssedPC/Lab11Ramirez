import java.io.*;
/**
* File: Lab11Prob01.java
* Class: CSCI 1302
* Author: Omar Ramirez
* Created on: Nov 13, 2026
* Last Modified: Nov 13, 2026
* Description: Your program will read this data file into a Java program, display the contents
to the Console, then write an exact copy of the data to another file.
*/
public class Lab11Prob01 {
    public static void main(String[] args) {
    	String inputFile = "src/people.dat";
    	String outputFile = "src/people-copy.dat";
    	try(
    		DataInputStream input = new DataInputStream(
    				new FileInputStream(inputFile));
    		DataOutputStream output = new DataOutputStream(
    				new FileOutputStream(outputFile));
    			){
    		while(true) {
    			try {
    				int age = input.readInt();
    				String name = input.readUTF();
    				String address = input.readUTF();
    				int zipCode = input.readInt();
    				double salary = input.readDouble();
    				
    				System.out.printf("%d %s %s %d %.2f%n",
    				        age, name, address, zipCode, salary);
    				output.writeInt(age);
    				output.writeUTF(name);
    				output.writeUTF(address);
    				output.writeInt(zipCode);
    				output.writeDouble(salary);
    				
    		}catch(EOFException e) {
    			break;
    		}
    			
    		}
    		
    	}  catch (IOException e) {
System.out.println("Error: "+ e.getMessage());		}
    	
    }
}
