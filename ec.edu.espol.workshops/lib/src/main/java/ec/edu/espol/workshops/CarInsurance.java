package ec.edu.espol.workshops;

public class CarInsurance {

    private float cost = 500;
    private boolean isValid;

    CarInsurance(Customer customer,boolean isValid) {
    	this.setValid(true);
        if (customer.getAge() > 80 || !customer.hasLicense()) {
        	this.setValid(false);
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

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
}
