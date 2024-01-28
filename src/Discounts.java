public class Discounts {
    private String discountType;
    private String store_id;
    private int lowQty;
    private int highQty;
    private double discount;

    public Discounts(String discountType, String store_id, int lowQty, int highQty, double discount) {
        this.discountType = discountType;
        this.store_id = store_id;
        this.lowQty = lowQty;
        this.highQty = highQty;
        this.discount = discount;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public int getLowQty() {
        return lowQty;
    }

    public void setLowQty(int lowQty) {
        this.lowQty = lowQty;
    }

    public int getHighQty() {
        return highQty;
    }

    public void setHighQty(int highQty) {
        this.highQty = highQty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
