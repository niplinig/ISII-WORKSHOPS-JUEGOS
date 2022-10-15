package ec.edu.espol.workshops;

public class Customer {
    private int age;
    private char sex;
    private boolean married;
    private boolean license;

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

    boolean isMale() {
        return sex=='F' ? false : true;
    }

    boolean isMarried() {
        return married;
    }

    boolean hasLicense() {
        return license;
    }

    boolean isAgeValid(int age) {
        if (age < 0) { 
        	return false;
        }else {
        return true;
        }
    }

}

