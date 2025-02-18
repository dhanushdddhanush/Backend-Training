package FoodApp;

/**
 * Implements the User interface .
 */
class Restaurant implements User {
    private String restoName;
    private String restoMobile;

    /**
     * Constructor to initialize a Restaurant with  name and number.
     *
     * @param restoName   The name of the restaurant.
     * @param restoMobile The contact number of the restaurant.
     */
    public Restaurant(String restoName, String restoMobile) {
        this.restoName = restoName;
        this.restoMobile = restoMobile;
    }

    /**
     * Logs in the restaurant and message
     */
    public void login() {
        System.out.println(restoName + " logged in as Restaurant.");
    }

    /**
     * Registers the restaurant and message
     */
    public void register() {
        System.out.println(restoName + " registered successfully.");
    }

    /**
     * Displays the restaurant profile information.
     */
    public void viewProfile() {
        System.out.println("Restaurant Profile: " + restoName + ", Mobile: " + restoMobile);
    }

    /**
     * Prepares an order for the given food item.
     *
     * @param item The food item that the restaurant is preparing.
     */
    public void prepareOrder(String item) {
        System.out.println(restoName + " is preparing the order: " + item);
    }
}
