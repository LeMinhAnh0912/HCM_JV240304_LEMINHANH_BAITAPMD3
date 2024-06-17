package Day4.BTTH3.RikkeiAcademy;

public class Category {
    String categoryId;
    String categoryName;

    public Category(String categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public String display() {
        return " categoryId: " + categoryId + " categoryName: " + categoryName;
    }
}
