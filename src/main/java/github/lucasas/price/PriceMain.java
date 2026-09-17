package github.lucasas.price;

public class PriceMain {


    void main() {
       double price = calculateFinalPrice(500,0.20);
        System.out.println(price);
    }

    private double calculateFinalPrice(double basePrice, double discount) {
        double totalPrice = addTax(basePrice);
        return applyDiscount(totalPrice, discount);
    }

    private double applyDiscount(double price, double discountPercent) {
        return price - (price * discountPercent);
    }

    private double addTax(double price) {
        return price + (price * 0.25);
    }


}
