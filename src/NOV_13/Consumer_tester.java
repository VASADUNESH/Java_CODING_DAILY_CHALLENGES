package NOV_13;

import java.util.function.Consumer;

class CartItem {
    private String name;
    private double price;
    private int quantity;

    public CartItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "CartItem [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}

class ShoppingCart {
    private CartItem item;

    public ShoppingCart(CartItem item) {
        this.item = item;
    }

    public CartItem getItem() {
        return item;
    }

    public void setItem(CartItem item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "ShoppingCart [item=" + item + "]";
    }
}

public class Consumer_tester {
    public static void main(String[] args) {
        CartItem cart = new CartItem("Item1", 200000, 6);
        ShoppingCart shoppingCart = new ShoppingCart(cart);
        
        CartItem cart2 = new CartItem("Item2", 90000000, 6);
        ShoppingCart shoppingCart2 = new ShoppingCart(cart2);
        
        Consumer<ShoppingCart> c = sc -> {
            CartItem item = sc.getItem();
            double totalPrice = item.getTotalPrice();
            if (totalPrice > 1000000) {
                totalPrice *= 0.1;
            }
            System.out.println("TotalPrice: " + totalPrice);
        };

        c.accept(shoppingCart);
        c.accept(shoppingCart2);
        
        
    }
}








/*
Ques-1
___________
Consumer Interface:
Scenario: You are working on an e-commerce application, and you want to implement a shopping cart feature that calculates the total price of the items and applies discounts if applicable.

Implement a Consumer interface that calculates the total price of the items in the cart.
Use the Consumer interface to apply a discount of 10% to the total price if the
totalPrice is above 1000000.

Requirements : 
-----------------

Class Name : CartItem
Artributes : private String name,private double price, private int quantity;
Constructor: parameterzed constructor to initialize CarItem fields
method     : double getTotalPrice() which returns total price as per quantity.
             String toString()

Class name : ShoppingCart
Atributes  : private CartItem items ;
Constructor: parameterized constructor to initialize ShoppingCart field
method     : setter and getter , toString();

Class name : Tester 
// Implement a Consumer interface to calculate the discount from total price . Print all the details.
void accept(ShoppingCart sc);
*/