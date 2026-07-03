public class ProductNestedClassDemo {
    static class Product {
        int productId;
        String productName;
        double price;

        Product(int productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
        }

        void displayProductInfo() {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Product product = new Product(101, "Laptop", 75000.0);
        product.displayProductInfo();
    }
} b  