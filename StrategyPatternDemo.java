package com.company;

import java.util.ArrayList;
import java.util.List;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new PaypalStrategy("myemail@example.com"));
        cart.pay(new CreditCardStrategy( "1234567890123456"));
    } }

interface PaymentStrategy{
     void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;

    }

    public CreditCardStrategy(String name) {
        this.name = name;
    }

    @Override
    public void pay(int amount){
        System.out.println("CreditCard:" + amount);
    }
}

class PaypalStrategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public PaypalStrategy(String email, String password){
        this.emailId = email;
        this.password = password;
    }

    public PaypalStrategy(String email) {
        this.emailId = email;
    }

    @Override
    public void pay(int amount){
        System.out.println("Paypal:" + amount);
    }
}

class Item{
    private String upcCode;
    private int price;
    public Item(String upc, int price){
        this.upcCode = upc;
        this.price = price;
    }
    public String getUpcCode(){

        return upcCode;
    }
    public int getPrice(){

        return price;
    }
}

class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }
    public void addItem(Item item){

        this.items.add(item);
    }
    public void removeItem(Item item){

        this.items.remove(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }
    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}






