package FoodApp;
/**
 * Implements the User interface 
 */
class DeliveryDriver implements User {
    private String driverName; 
    private String driverMobile; 
    /**
     * Constructor to initialize the delivery driver with name and mobile number.
     *
     * @param driverName   The name of the delivery driver.
     * @param driverMobile The mobile number of the delivery driver.
     */
    public DeliveryDriver(String driverName, String driverMobile) {
        this.driverName = driverName;
        this.driverMobile = driverMobile;
    }

    /**
     * Gets the name of the delivery driver.
     *
     * @return The name of the driver.
     */
    public String getDriverName() {  
        return driverName;
    }

    /**
     * Assigns a delivery driver for an order.
     */
    public void assign() {
        System.out.println("Just a minute, assigning rider...");
    }

    /**
     * Logs the driver into the system
     */
    public void login() {
        System.out.println(driverName + " logged in as Delivery Driver.");
    }

    /**
     * Registers the driver in the system.
     */
    public void register() {
        System.out.println(driverName + " registered successfully.");
    }

    /**
     * Displays the profile details of the delivery driver.     */
    public void viewProfile() {
        System.out.println("Driver Profile: " + driverName + ", Mobile: " + driverMobile);
    }

    /**
     * Allows the driver to accept an order for delivery.
     *
     * @param item The name of the food item being delivered.
     */
    public void acceptOrder(String item) {
        System.out.println(driverName + " accepted the order: " + item);
    }
}
