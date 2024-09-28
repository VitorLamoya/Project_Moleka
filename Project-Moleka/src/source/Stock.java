package source;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Product> products;

    public Stock() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product " + product.getName() + " has been added!");
    }

    public void listProducts() {
        for (Product produto : this.getProducts()) {
            System.out.println("Product: " + produto.getName() + "\nType: " + produto.getType() + "\nCompany: " + produto.getCompany().getName());
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}