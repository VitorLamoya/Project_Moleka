package source;

import java.util.List;
import java.util.ArrayList;

public class Company {
    private String name;
    private int cnpj;
    private List<Product> products;
    //Falta pôr o restante das caracteristicas da empresa

    public Company(String name,int cnpj) {
        this.name = name;
        this.cnpj = cnpj;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product " + product.getName() + " has been added!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
