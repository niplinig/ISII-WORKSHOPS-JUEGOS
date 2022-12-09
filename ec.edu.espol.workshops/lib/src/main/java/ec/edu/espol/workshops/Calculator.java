package ec.edu.espol.workshops;

public class Calculator {
	
    public static boolean isAgeValid(int age) {
        return (18 <= age) && (age < 80);
    }
    
    public static boolean isLicenseValid(int licenseNumber) {
        return Integer.toString(licenseNumber).length() == 9;
    }
 
	public static int calCarIns(Customer customer) {
	    
		int cost = 600;
	    int age = customer.getAge();
	    boolean isFemale = customer.isFemale();
	    boolean isMale = customer.isMale();
	    boolean isMarried = customer.isMarried();
	    int licenseNumber = customer.getLicenseNumber();
	    
	    if (age < 18 || age > 80 || Integer.toString(licenseNumber).length() != 9) {
	        return cost = -1;
	    }
	    if (isMale && !isMarried && age < 25) {
	        cost += 1500;
	    }
	    if (isFemale || isMarried) {
	        cost -= 200;
	    }
	    if (45 <= age && age < 65) {
	        cost -= 100;
	    }
	    return cost;
	}
}