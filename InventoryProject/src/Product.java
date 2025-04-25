/**
 * A class that holds the price, id, and quantity of a product.
 *
 * @author Matas Aleksas
 * @version 1.0.0
 * **/
public class Product {
    private double price;
    private int id;
    private int quantity;

    /**
     * Constructs a Product instance with the specified price, id, and quantity.
     *
     * @param price the price of the product
     * @param id the unique identifier of the product
     * @param quantity the quantity of the product in stock
     */
    public Product(double price, int id, int quantity) {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return the price of the product as a double
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Retrieves the unique identifier of the product.
     *
     * @return the id of the product
     */
    public int getId() {
        return this.id;
    }

    /**
     * Retrieves the quantity of the product in stock.
     *
     * @return the quantity of the product
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Updates the quantity of the product.
     *
     * @param quantity the new quantity of the product to be set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the new price of the product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Updates the unique identifier of the product.
     *
     * @param id the new unique identifier for the product
     */
    public void setId(int id) {
        this.id = id;
    }
}
