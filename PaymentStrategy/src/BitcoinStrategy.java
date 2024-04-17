class BitcoinStrategy implements PaymentStrategy {
    private String walletAddress;

    public BitcoinStrategy(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        // Logic xử lý thanh toán bằng Bitcoin
        System.out.println("Paid $" + amount + " using Bitcoin wallet: " + walletAddress);
    }
}