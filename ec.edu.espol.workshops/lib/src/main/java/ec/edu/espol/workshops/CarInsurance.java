package ec.edu.espol.workshops;

/**
 * @author Nicolás Plaza
 * */
public class CarInsurance {
	
    private float cost = 500;
    CarInsurance(Customer customer) {
    	if (customer.getAge() > 80 || !customer.hasLicense()) {
        	cost = -1;
        	return ;
        }
        if (customer.isMale() && !customer.isMarried())
            if (customer.getAge() < 25)
                cost += 1500.0;
        if (!customer.isMale() || customer.isMarried())
            cost -= 200.0;
        if (customer.getAge() >= 45 && customer.getAge() < 65)
            cost -= 100.0;
    }

    @Override
    public String toString() {
        return String.valueOf(cost);
    }
}
