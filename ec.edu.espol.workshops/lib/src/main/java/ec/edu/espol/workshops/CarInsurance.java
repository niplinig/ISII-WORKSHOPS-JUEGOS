package ec.edu.espol.workshops;

public class CarInsurance {

    private float cost = 500.0;

    CarInsurance(Customer customer) {
        if (customer.getAge() > 80 || !customer.hasLicense())
            return null;
        if (customer.isMale() && !customer.isMarried())
            if (customer.getAge() < 25)
                cost += 1500.0;
        if (!customer.isMale() || customer.isMarried())
            cost -= 200.0;
        if (customer.getAge() >= 45 && cusotmer.getAge() < 65)
            cost -= 100.0;
    }

    @Override
    public toString() {
        return cost;
    }


}
