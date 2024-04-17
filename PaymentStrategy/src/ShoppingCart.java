import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Item> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        // Khởi tạo giỏ hàng
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        // Thêm sản phẩm vào giỏ hàng
        if (items == null) {
            items = new ArrayList<>(); // Khởi tạo danh sách sản phẩm nếu chưa tồn tại
        }
        items.add(item);
    }

    public void checkout() {
        // Thanh toán
        int totalAmount = calculateTotalAmount();
        paymentStrategy.pay(totalAmount);
    }

    private int calculateTotalAmount() {
        // Tính tổng số tiền trong giỏ hàng
        // Logic tính tổng số tiền từ danh sách sản phẩm
//        return 0;
        int totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

}