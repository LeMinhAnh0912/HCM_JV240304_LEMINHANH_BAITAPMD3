package src.Session15.business;

import src.Session15.entity.Product;

public interface IProductDesign extends IGenericDesign<Product, String> {
    //sắp xếp sản phẩm
    void sortProduct(Product[] arrProduct);

    //tìm kiếm sản phẩm theo tên
    void searchProduct(Product[] arrProduct);

    //timd kiếm trong khoảng giá a-b
    void searchProductByPrice(Product[] arrProduct, float a, float b);
}
