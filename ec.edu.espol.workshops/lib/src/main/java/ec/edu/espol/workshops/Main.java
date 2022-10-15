package ec.edu.espol.workshops;

import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);
    private static int age;
    private static char sex;
    private static char married;
    private static char license;
    private static boolean isMarried;
    private static boolean hasLicense;
    

    public static void main(String[] args) {

        System.out.println("Welcome to the CarInsurance Company");

        System.out.print("Enter customer age: \n " );

        age = sc.nextInt();

        System.out.print("\n Enter customer sex: ('F' for female or 'M' for male \n ");

        sex = sc.next().charAt(0);

        System.out.print("\n Is customer married? (y for yes, n for no)\n ");

        married =  sc.next().charAt(0);

        boolean isMarried = married == 'y' ? true : false;

        System.out.print("\n Does customer have license? (y for yes, n for no)\n ");

        license =  sc.next().charAt(0);
        
        boolean hasLicense = license == 'y' ? true : false;

        Customer customer = new Customer(age,sex, isMarried, hasLicense);

        CarInsurance carInsurance = new CarInsurance(customer,true);

        System.out.print(carInsurance.toString());

        sc.close();
    }

}