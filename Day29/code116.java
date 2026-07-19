import java.util.Scanner;

class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    // Constructor
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product ID --> " + productId);
        System.out.println("Product Name --> " + productName);
        System.out.println("Price --> " + price);
        System.out.println("Quantity --> " + quantity);
    }
}

public class code116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n^^^^^ INVENTORY MANAGEMENT SYSTEM ^^^^^");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Product Quantity: ");
                    int quantity = sc.nextInt();

                    products[count] = new Product(id, name, price, quantity);

                    count++;

                    System.out.println("Product has been Added Successfully.");

                    break;


                case 2:

                    if(count == 0) {
                        System.out.println("No Products Available.");
                    }
                    else {

                        for(int i = 0; i < count; i++) {
                            products[i].displayProduct();
                        }

                    }

                    break;


                case 3:

                    System.out.print("Enter the Product ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++) {

                        if(products[i].productId == searchId) {

                            products[i].displayProduct();
                            found = true;
                            break;

                        }
                    }

                    if(found == false) {
                        System.out.println("Product Not Found.");
                    }

                    break;


                case 4:

                    System.out.print("Enter the Product ID to Update Quantity: ");
                    int updateId = sc.nextInt();

                    found = false;

                    for(int i = 0; i < count; i++) {

                        if(products[i].productId == updateId) {

                            System.out.print("Enter New Quantity: ");
                            products[i].quantity = sc.nextInt();

                            System.out.println("Quantity Updated Successfully.");

                            found = true;
                            break;
                        }
                    }

                    if(found == false) {
                        System.out.println("Product Not Found.");
                    }

                    break;


                case 5:

                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for(int i = 0; i < count; i++) {

                        if(products[i].productId == deleteId) {

                            for(int j = i; j < count - 1; j++) {
                                products[j] = products[j + 1];
                            }

                            products[count - 1] = null; // to remove the duplicate last element or product

                            count--;

                            System.out.println("Product Deleted Successfully.");

                            found = true;
                            break;
                        }
                    }

                    if(found == false) {
                        System.out.println("Product Not Found.");
                    }

                    break;


                case 6:

                    System.out.println("Thank You for using Inventory Management System!");
                    break;


                default:

                    System.out.println("Invalid Choice.");

            }

        } while(choice != 6);


        sc.close();
    }
}