package ec.edu.espol.workshops;

/**
 * The Customer class is a class that manages the customer info
 * 
 * @author Nicolás Plaza
 * @version 1.0
 * @since 2022-10-21
 */
public class Customer {
    private int age;
    private char sex;
    private boolean married;
    private boolean license;

	/**
	 * Constructor of the class
	 * @param int This is the age of the customer
	 * @param char This is the sex of the customer (F for female, M for Male)
	 * @param boolean This stores info about whether he is married or not
	 * @param boolean This stores info about whether he has a license or not
	 */
    Customer(int age, char sex, boolean married, boolean license) {
        this.age = age;
        this.sex = sex;
        this.married = married;
        this.license = license;
    }

    int getAge() {
        return age;
    }

    char getSex() {
        return sex;
    }

    boolean isFemale() {
        return sex=='F';
    }

    boolean isMarried() {
        return married;
    }
    
    boolean hasLicense() {
        return license;
    }

}

