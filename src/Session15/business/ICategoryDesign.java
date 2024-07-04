package src.Session15.business;

import jdk.jfr.Category;

public interface ICategoryDesign extends IGenericDesign<Category, String> {
    void updateCatalogStatus(String categoryId, boolean catalogStatus);

}
