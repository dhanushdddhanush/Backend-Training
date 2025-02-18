package FoodApp;

/**
 * Implements the User interface 
 */
class Customer implements User {
    private String name;
    private String mobile; 

    /**
     * Constructor to initialize the customer with a name and mobile number.
     *
     * @param name   The name of the customer.
     * @param mobile The mobile number of the customer.
     */
    public Customer(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    /**
     * Logs the customer into the system
     */
    public void login() {
        System.out.println(name + " logged in as Customer.");
    }

    /**
     * Registers the customer in the system.
     */
    public void register() {
        System.out.println(name + " registered successfully.");
    }

    /**
     * Displays the profile details of the customer.
     */
    public void viewProfile() {
        System.out.println("Customer Profile: " + name + ", Mobile: " + mobile);
    }

    /**
     * Allows the customer to place an order for a food item.
     *
     * @param item The name of the food item being ordered.
     */
    public void placeOrder(String item) {
        System.out.println(name + " placed an order for: " + item);
    }
}
