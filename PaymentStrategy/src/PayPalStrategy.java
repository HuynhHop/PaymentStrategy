class PayPalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        // Logic xử lý thanh toán qua PayPal
        System.out.println("Paid $" + amount + " via PayPal.");
    }
}