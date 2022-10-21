package ec.edu.espol.workshops;

/**
 * <h1>Calculte the car insurance<h1>
 * The CarInsurance class is a class that can calculate
 * the insurance of a given customer.
 * 
 * @author Nicolás Plaza
 * @version 1.0
 * @since 2022-10-21
 */

public class CarInsurance {
	
	private int cost;
	private Customer customer;
	
	/**
	 * Constructor of the class
	 * @param int This is the cost of the insurance
	 */
	CarInsurance(Customer customer, int cost) {
		this.cost = 500 + cost;
		this.customer = customer;
    }
	
	/**
	 * This method is used to create the car insurance.
	 * @param Customer This is the first parameter to calCarIns
	 * @return CarInsurance This returns an Object with the cost
	 */
    public static CarInsurance calCarIns(Customer customer) {
    	
    	int age = customer.getAge();
        boolean isFemale = customer.isFemale();
        boolean married = customer.isMarried();
        boolean licensed = customer.hasLicense();
        
    	if (age > 80 && !licensed) return null;
    	
    	else if (!isFemale && married && age < 25) return new CarInsurance(customer, 1500);
    	
    	else if (isFemale || married) return new CarInsurance(customer, -200);
    	
    	else if (age >= 45 && age < 65) return new CarInsurance(customer, -100);
    	
    	return new CarInsurance(customer, 0);
    }
    
    @Override
    public String toString() {
    	return Integer.toString(cost);
    }
}
