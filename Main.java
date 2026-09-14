import checkoutSystem.Checkout;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    static void main() {
        Checkout checkout = new Checkout();

        Scanner scanner = new Scanner(System.in);
        String choice = "yes";
        System.out.print("What is the customer's name");
        String customerName = scanner.nextLine();
        while(choice.equalsIgnoreCase("yes")){
            System.out.println("What did the customer buy?");
            String itemName = scanner.nextLine();
            System.out.println("How many pieces?");
            int quantinty = scanner.nextInt();
            System.out.println("How much per unit?");
            double pricePerUnit = scanner.nextDouble();

            scanner.nextLine();
            checkout.addProduct(itemName, pricePerUnit, quantinty);
            System.out.println("Add more items?");

            choice = scanner.nextLine();
        }
            System.out.println("What is your name?");
            String cashierName = scanner.nextLine();
            System.out.println("Hoe much discount will he get?");
            double discount = scanner.nextDouble();
            checkout.applyDiscount((discount));

            System.out.println("SEMEICOLON STORE\n MAIN BRANCH\n" + "LOCATION: 312, HERBERT MARCULAY WAY, SABO YABA, LAGOS.\n" + " TEL: 03293828343\n " + " Date:LocalDateTime.now() " + "\n Cashier: " + cashierName  + "\n customerName: " +  customerName);

                System.out.println("=".repeat(100));
                System.out.println("-".repeat(100));
                System.out.printf("%20s %20s %20s %20s\n", "ITEM", "QTY", "PRICE", "TOTAL(NIG)");
                        for(int count = 0; count< checkout.checkCartQuantity(); count++) {
                            System.out.printf("%20s %20d %20f %20f \n", checkout.getProducts().get(count),
                                    checkout.getProductQuantity().get(count), checkout.getProductPrices().get(count), checkout.totalProductPrice(checkout.getProducts().get(count)));
                        }
                            double subTotal = checkout.totalPrice();
                            double discountAmount = checkout.applyDiscount(discount);
                            double vatAmount = checkout.applyVat();
                            System.out.println("-".repeat(100));
                            System.out.printf("%35s:%15f\n%35s:%15f\n%35s:%15f\n", "Sub Total:", subTotal, "Discount", discountAmount, "VAT @ 7.5%", vatAmount);
                            System.out.println("=".repeat(100));
                            double billTotal = subTotal - discountAmount + vatAmount;
                            System.out.printf("%35s:%15f\n", "Bill Total:", billTotal);
                            System.out.println("=".repeat(100));
                            System.out.println("\tTHIS IS NOT A RECEIPT KINDLY PAY " + billTotal);
                            System.out.println("=".repeat(100));
                            System.out.println("How much did the customer give o you?");
                            double amount = scanner.nextDouble();
                            System.out.printf("%35s:%15f\n", "Amount Paid:", amount);
                            System.out.printf("%35s:%15f\n", "Balance:", amount - billTotal);
                            System.out.println("=".repeat(100));
                            System.out.println("\tTHANK YOU FOR YOUR PATRONAGE");
                            System.out.println("=".repeat(100));
                        }
    }






