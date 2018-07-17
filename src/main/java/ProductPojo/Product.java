/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductPojo;

/**
 *
 * @author tommib
 */
public class Product {

    private String product;
    private String details;

    public Product(String product, String details) {
        this.product = product;
        this.details = details;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
