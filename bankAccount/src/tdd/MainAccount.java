package tdd;

import javax.swing.*;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = """
                
                Welcome To Orion Banking App Simulation
                
                User's Menu
                Select an Option Pls.
                1. CheckBalance.
                2. Deposit.
                3. Withdraw.
                4. Exit.
                
                """;
        boolean start = true;
        while (true) {

            System.out.println(menu);
            int option = input.nextInt();

            switch (option) {

                case 1 -> {
                    //System.out.println("Your current balance is: " + Account.checkBalance());
                    System.out.print("Enter your PIN to check your balance: ");
                    int pin = input.nextInt();
                    if (pin == 2468) {
                        System.out.println("Your current balance is: " + Account.checkBalance());
                    }
                    else{
                        System.out.print("Invalid PIN, try again");
                    }
                }
                case 2 -> {
                    System.out.print("Please enter amount to be deposited: ");
                    double amount = input.nextDouble();
                    Account.deposit(amount);
                    System.out.print("Your balance is: " + Account.checkBalance());
                }

                case 3 -> {
                    System.out.print("Enter the amount to withdraw: ");

                    double amount = input.nextDouble();
                    Account.withdraw(amount);
                    System.out.println("You can get your cash: " + amount + ", your new balance is: " + Account.checkBalance());
                }
                case 4 -> start = false;
                default -> System.out.print("Invalid option selected");

            }
        }

    }
}