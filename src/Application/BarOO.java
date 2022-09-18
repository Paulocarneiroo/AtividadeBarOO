package Application;

import Entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class BarOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.print("Gender (f/F/m/M): ");
        char gender = sc.next().charAt(0);
        while (gender != 'f' && gender != 'F' && gender != 'm' && gender != 'M'){
            System.out.print("Invalid input, please enter (f/F/m/M): ");
            gender = sc.next().charAt(0);
        }
        System.out.print("Amount of beer: ");
        int beer = sc.nextInt();
        System.out.print("Amount of soda: ");
        int soda = sc.nextInt();
        System.out.print("Amount of barbecue: ");
        int barb = sc.nextInt();

        Bill bill = new Bill(gender, beer, barb, soda);

        System.out.println();
        System.out.println("SUMMARY:");
        System.out.println("Consume = R$ " + String.format("%.2f",bill.feeding()));
        if (bill.cover() == 0){
            System.out.println("Couvert free");
        }else {
            System.out.println("Couvert = R$ " + String.format("%.2f",bill.cover()));
        }
        System.out.println("Ticket = R$ " + String.format("%.2f",bill.ticket(gender)));
        System.out.println("Bill = R$ " + String.format("%.2f",bill.total()));

        System.out.println();


        sc.close();
    }
}
