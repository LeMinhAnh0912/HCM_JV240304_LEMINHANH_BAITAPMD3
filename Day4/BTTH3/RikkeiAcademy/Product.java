package Day4.BTTH3.RikkeiAcademy;

public class Product {
    String productId;
    String productName;
    String productPrice;
    String category;

    public Product(String productId, String productName, String productPrice, String category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public String display() {
        return " productId: " + productId + " productName: " + productName + " productPrice: " + productPrice
                + " category: "
                + category;
    }
}
