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
     * Updates the quantity of a product in the inventory based on its unique identifier.
     * If the product with the specified id exists in the inventory, its quantity
     * is updated to the provided value.
     *
     * @param id the unique identifier of the product whose quantity is to be updated
     * @param quantity the new quantity to be set for the product
     */
    public void SetItemQuantity(int id, int quantity) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setQuantity(quantity);
            }
        }
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
            Product item = new Product(price, id, quantity);
            SetItemQuantity(id, item.getQuantity() + quantity);
            System.out.println("Item already exists in the inventory, adding quantity to existing item.");
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
     * Updates the price of the product with the specified unique identifier.
     * If the product is found in the inventory, its price is updated.
     * If the product does not exist, the method performs no action.
     *
     * @param id the unique identifier of the product whose price is to be updated
     * @param price the new price to be set for the product
     */
    public void SetItemPrice(int id, double price) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setPrice(price);
            }
        }
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

    /**
     * Checks if a product with the specified unique identifier already exists in the inventory.
     *
     * @param id the unique identifier of the product to check
     * @return true if a product with the given id exists in the inventory, otherwise false
     */
    public boolean AlreadyExist(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
