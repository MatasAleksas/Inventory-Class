import java.util.ArrayList;

/**
 * Keeps track of various products and can sum up the inventory value.
 *
 * @author Matas Aleksas
 * @version 1.0.0
 * **/
public class Inventory {
    private ArrayList<Product> productList;

    /**
     * Constructs an Inventory instance by initializing an empty product list.
     */
    public Inventory() {
        productList = new ArrayList<>();
    }

    /**
     * Adds a new product to the inventory with the specified price, id, and quantity.
     *
     * @param price the price of the product to be added
     * @param id the unique identifier of the product to be added
     * @param quantity the quantity of the product to be added
     */
    public void AddItem(double price, int id, int quantity) {
        if (!AlreadyExist(id)) {
            Product item = new Product(price, id, quantity);
            productList.add(item);
        } else {
            System.out.println("Item already exists in the inventory");
        }
    }

    /**
     * Retrieves the price of a product based on its unique identifier.
     *
     * @param id the unique identifier of the product
     * @return the price of the product as a double if found, otherwise returns -1
     */
    public double GetItemPrice(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product.getPrice();
            }
        }
        return -1;
    }

    /**
     * Retrieves the quantity of a product in stock based on its unique identifier.
     *
     * @param id the unique identifier of the product
     * @return the quantity of the product if found, or -1 if the product does not exist
     */
    public int GetItemQuantity(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product.getQuantity();
            }
        }
        return -1;
    }

    public boolean AlreadyExist(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
