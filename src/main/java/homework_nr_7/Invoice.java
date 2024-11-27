package homework_nr_7;

public class Invoice {

    String model;
    String description;
    int numberOfBoughtProducts;
    double priceOfProduct;

    public Invoice(String model, String description, int numberOfBoughtProducts, double priceOfProduct) {
        this.model = model;
        this.description = description;
        this.numberOfBoughtProducts = numberOfBoughtProducts;
        this.priceOfProduct = priceOfProduct;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfBoughtProducts() {
        return numberOfBoughtProducts;
    }

    public void setNumberOfBoughtProducts(int numberOfBoughtProducts) {
        this.numberOfBoughtProducts = numberOfBoughtProducts;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public double getAmount(){
        int validQuantity;
        double validPrice;
        double totalAmount;

        if(numberOfBoughtProducts > 0 ){
            validQuantity = numberOfBoughtProducts;
        } else {
            validQuantity = 0;
        }

        if (priceOfProduct > 0 ){
            validPrice = priceOfProduct;
        } else {
            validPrice = 0;
        }

        totalAmount = validQuantity * validPrice;

        return totalAmount;
    }

    public static void main(String[] args) {

        Invoice invoice = new Invoice("ModelX", "HighPerformance", 3, 35000);

        double amount = invoice.getAmount();
        System.out.println("Total amount: " + amount);
    }



}
