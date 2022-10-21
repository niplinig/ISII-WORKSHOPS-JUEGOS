package ec.edu.espol.workshops;

import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the CarInsurance Company");

        System.out.print("Enter customer age: \n " );

        int age = sc.nextInt();

        System.out.print("\n Enter customer sex: ('F' for female or 'M' for male \n ");

        char sex = sc.next().charAt(0);

        System.out.print("\n Is customer married? (y for yes, n for no)\n ");

        char married = sc.next().charAt(0);

        boolean isMarried = married == 'y';

        System.out.print("\n Does customer have license? (y for yes, n for no)\n ");

        char license = sc.next().charAt(0);
        
        boolean hasLicense = license == 'y';

        Customer newCustomer = new Customer(age, sex, isMarried, hasLicense);
                
        CarInsurance carInsurance = CarInsurance.calCarIns(newCustomer);

        System.out.print(carInsurance.toString());

        sc.close();
    }

}