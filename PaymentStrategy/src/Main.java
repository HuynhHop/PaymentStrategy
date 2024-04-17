//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ví dụ sử dụng
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Product A", 50, "SKU123"));
        cart.addItem(new Item("Product B", 100, "SKU456"));

        // Chọn phương thức thanh toán (ví dụ: PayPal)
//        PaymentStrategy paymentStrategy = new PayPalStrategy("example@email.com", "password");
//        cart.setPaymentStrategy(paymentStrategy);
        //Chọn phương thức thanh toán (ví dụ: creditCard)
        PaymentStrategy creditCardStrategy = new CreditCardStrategy("John Doe", "123456789", "123", "12/25");
        cart.setPaymentStrategy(creditCardStrategy);
        // Thanh toán
        cart.checkout();
    }
}