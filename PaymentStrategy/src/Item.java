class Item {
    private String item;
    private int price;
    private String sku;

    public Item(String item, int price, String sku) {
        this.item = item;
        this.price = price;
        this.sku = sku;
    }
//Trả về giá của sản phẩm (bổ sung thêm)
    public int getPrice() {
        return price;
    }
}