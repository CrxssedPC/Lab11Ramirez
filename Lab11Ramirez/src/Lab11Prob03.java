import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Lab11Prob03 {
    public static void main(String[] args) {
    	String inputFile = "src/people.dat";
        String outputFile = "src/people-salary-sorted.dat";
        ArrayList<Person> people = new ArrayList<>();
    	try(
    		DataInputStream input = new DataInputStream(
    				new FileInputStream(inputFile));
    		
    			){
    		while(true) {
    			try {
    				int age = input.readInt();
    				String name = input.readUTF();
    				String address = input.readUTF();
    				int zipCode = input.readInt();
    				double salary = input.readDouble();
    				Person person = new Person();
    				person.setAge(age);
    				 person.setName(name);
                     person.setAddress(address);
                     person.setZipCode(zipCode);
                     person.setSalary(salary);
    				people.add(person);
    				
    		}catch(EOFException e) {
    			break;
    		}
    			
    		}
    		System.out.println("File copied.");
    		
    	}  catch (IOException e) {
System.out.println("Error: "+ e.getMessage());		
}
    	Collections.sort(people);
    	try(
    			DataOutputStream output = new DataOutputStream(new FileOutputStream(outputFile));
    			){
    		for (Person person : people) {
    			System.out.println(person.toString());
    			System.out.println();
    			output.writeUTF(person.toString());
    		}
    		System.out.println("Sorted file created");
    	}catch (IOException e) {
    		System.out.println("Error: "+ e.getMessage());	
    	
    }
}
}
