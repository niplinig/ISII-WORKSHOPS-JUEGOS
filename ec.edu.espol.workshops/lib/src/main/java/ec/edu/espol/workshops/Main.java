package ec.edu.espol.workshops;

import java.util.Scanner;

class Main {

    private Scanner sc = new Scannner(System.in);
    private int age;
    private char sex;
    private char married;
    private boolean isMarried;

    public static void main(String[] args) {

        System.out.println("Welcome to the CarInsurance Company");

        System.out.print("Enter customer age: ")

        age = sc.nextInt();

        System.out.print("\nEnter customer sex: ('F' for female or 'M' for male");

        sex = sc.nextChar();

        System.out.print("\Is customer married? (y for yes, n for no)");

        married = sc.nextChar();

        boolean isMarried = married == "y" ? true : false;

        Customer customer = new Customer();

        CarInsurance carInsurance = new CarInsurance(customer);

        System.out.println(carInsurance.toString());

        sc.close();
    }

}