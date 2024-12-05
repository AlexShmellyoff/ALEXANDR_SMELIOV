package homework_nr_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Product {

    private String name;
    private double price;
    private Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("MacBook Pro", 1299.99, Category.ELECTRONICS));
        productList.add(new Product("Samsung Galaxy S21", 799.99, Category.ELECTRONICS));
        productList.add(new Product("AirPods Pro", 249.99, Category.ELECTRONICS));
        productList.add(new Product("Smart Watch", 199.99, Category.ELECTRONICS));

        productList.add(new Product("Bread", 4.99, Category.FOOD));
        productList.add(new Product("Salmon", 15.99, Category.FOOD));
        productList.add(new Product("Coffee", 19.99, Category.FOOD));

        productList.add(new Product("Jeans", 59.99, Category.CLOTHING));
        productList.add(new Product("T-Shirt", 24.99, Category.CLOTHING));
        productList.add(new Product("Jacket", 89.99, Category.CLOTHING));

        List<String> expensiveProducts = productList.stream()
                .filter(e -> e.getPrice() > 50)
                .map(e -> e.getName())
                .toList();
        System.out.println("Products over 50: " + expensiveProducts);

        Optional<Product> mostExpensiveElectronic = productList.stream()
                .filter(e -> e.getCategory() == Category.ELECTRONICS)
                .findFirst();
        System.out.println("Most expensive electronic: " + mostExpensiveElectronic.get().getName());

        long foodCount = productList.stream()
                .filter(e -> e.getCategory() == Category.FOOD)
                .count();
        System.out.println("Number of food products: " + foodCount);

        boolean hasProductsUnder20 = productList.stream()
                .filter(e -> e.getPrice() < 20)
                .findFirst()
                .isPresent();
        System.out.println("Has products under 20: " + hasProductsUnder20);

    }
}
