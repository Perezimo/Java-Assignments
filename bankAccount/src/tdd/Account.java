package tdd;

import java.sql.SQLOutput;

public class Account {
    private static double balance;
    private static double number;

    public static double checkBalance(){
        return balance;
    }
    public static void deposit(double amount){
        if(amount < 0) {
            System.out.println("Invalid amount");
        }
        else{
            balance += amount;
        }
    }

    public static void withdraw(double amount) {
        if(amount< 0) {
            System.out.println("Invalid amount");
        }
        else if(amount > balance) {
              System.out.println("Insufficient amount. Please, enter amount less than your balance");
       }
       else{
            balance -= amount;
        }

        }

}
