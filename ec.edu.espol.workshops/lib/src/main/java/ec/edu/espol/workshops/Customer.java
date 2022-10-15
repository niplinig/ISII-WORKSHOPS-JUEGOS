package ec.edu.espol.workshops;

public class Customer {
    private int age;
    private char sex;
    private boolean married;
    private boolean license;

    Customer(int age, char sex, boolean married) {
        if !isAgeValid(age) {
            return null
        }
        this.age = age;
        this.sex = sex
        this.married = married;
    }

    int getAge() {
        return age;
    }

    char getSex() {
        return sex;
    }

    boolean isMale() {
        return sex=="F" ? false : true
    }

    boolean isMarried() {
        return married;
    }

    boolean hasLicense() {
        return license;
    }

    boolean isAgeValid(int age) {
        if age < 0 return false;
        return true;
    }

}

