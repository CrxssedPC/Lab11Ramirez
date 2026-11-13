import java.io.*;
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
    				
    				System.out.println("Age: "+ age);
    				System.out.println("Name: "+ name);
    				System.out.println("Address: "+ address);
    				System.out.println("Zip Code: "+ zipCode);
    				System.out.println("Salary: "+ salary);
    				System.out.println();
    				output.writeInt(age);
    				output.writeUTF(name);
    				output.writeUTF(address);
    				output.writeInt(zipCode);
    				output.writeDouble(salary);
    				
    		}catch(EOFException e) {
    			break;
    		}
    			
    		}
    		System.out.println("File copied.");
    		
    	}  catch (IOException e) {
System.out.println("Error: "+ e.getMessage());		}
    	
    }
}
