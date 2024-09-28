import source.Company;
import source.Product;
import source.Stock;

public class Main {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");

        Company empresa = new Company("Moleka",340000194);
        Product picole  = new Product(
                "Picole",
                "Sorvete",
                "O melhor picolé da cidade!",
                21,
                5.43
        );
        Stock stock = new Stock();
        picole.addCompany(empresa);
        empresa.addProduct(picole);
        
//        for (Product produto : empresa.getProducts()) {
//            System.out.println("Product: " + produto.getName() + "\nType: " + produto.getType() + "\nCompany: " + produto.getCompany().getName());
//        }

//        System.out.println(empresa.getProducts());

        stock.addProduct(picole);
        stock.addProduct(picole);
        stock.addProduct(picole);

        stock.listProducts();
    }
}