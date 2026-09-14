package checkoutSystem;

import java.util.ArrayList;

public class Checkout {
    ArrayList<String> products = new ArrayList<>();
    ArrayList<Double> productPrices = new ArrayList<>();
    ArrayList<Integer> productQuantity = new ArrayList<>();

    public ArrayList<Integer>getProductQuantity(){
        return productQuantity;
    }

    public ArrayList<Double> getProductPrices() {
        return productPrices;
    }
    public ArrayList<String>getProducts(){
        return products;
    }
   // ArrayList<Integer> productQuantity =new ArrayList<>();
    public void addProduct(String name, double price, int quantity) {
        products.add(name);
        productPrices.add(price);
        productQuantity.add(quantity);
    }

    public int checkProductQuantity(String name) {
        for(int count = 0; count < products.size(); count++){
            if(products.get(count).equals(name)){
                return productQuantity.get(count);
            }
        }
        return 0;
    }

    public double checkProductPrice(String name) {
        double price = 0;
        for(int count = 0; count < products.size(); count++){
            if(products.get(count).equals(name)){
                price = productPrices.get(count);
            }
    }
        return price;
    }

    public int checkCartQuantity() {
        return products.size();
    }

    public double totalPrice() {
        double total=0;
        for(int count = 0; count < products.size(); count++){
            total+=productPrices.get(count) * productQuantity.get(count);
        }
        return total;
    }

    public double totalProductPrice(String name) {
        double total = 0;
        for(int count=0; count < products.size(); count++){
            if(products.get(count).equals(name)){
                total = productQuantity.get(count) * productPrices.get(count);
            }
        }
        return total;
    }

    public double applyDiscount(double discountPercent) {
       return totalPrice() * (discountPercent/100);
    }

    public double applyVat() {
        return totalPrice() * 0.075;
    }
}
