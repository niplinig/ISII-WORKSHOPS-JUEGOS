package ec.edu.espol.workshops;

/**
 * The CarInsurance class is a class than can calculate
 * the insurance of a given customer.
 */

public class CarInsurance {
	
	/**
	 * A float to keep track of the cost.
	 * The base premium cost is $500
	 */
    private float cost = 500;
       
    CarInsurance(int cost) {
    	this.cost += cost;
    }
    
    public CarInsurance calCarIns(Customer customer) {
    	
    	int age = customer.getAge();
        boolean isFemale = customer.getSex() == 'F';
        boolean married = customer.isMarried();
        boolean licensed = customer.hasLicense();
        
    	CarInsurance carInsurance;
    	
    	if (age > 80 && !licensed) return null;
    	
    	else if (!isFemale && married && age < 25) return carInsurance = new CarInsurance(1500);
    	
    	else if (isFemale || married) return carInsurance = new CarInsurance(-200);
    	
    	else if (age >= 45 && age < 65) return carInsurance = new CarInsurance(-100);
    	
    	return carInsurance = new CarInsurance(0);
    }
}
