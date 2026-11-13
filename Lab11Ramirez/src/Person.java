import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;
public class Person implements Comparable<Person>, Serializable {
	private int age;
    private String name;
    private String address;
    private int zipCode;
    private double salary;
    public Person() {
    	
    }
    public Person(int age, String name, String address,int zipCode, double salary) {
    	this.age=age;
    	this.name=name;
    	this.address =address;
    	this.zipCode = zipCode;
    	this.salary=salary;
    }
    
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Person other) {
		return Double.compare(other.salary, this.salary);
	}
	@Override
	public String toString() {
		NumberFormat currency = 
				NumberFormat.getCurrencyInstance(Locale.US);
		 return "Age: " + age +
	               "\nName: " + name +
	               "\nAddress: " + address +
	               "\nZip Code: " + zipCode +
	               "\nSalary: " + currency.format(salary);
	}
	

}
