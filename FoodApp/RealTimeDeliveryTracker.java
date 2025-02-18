package FoodApp;

class RealTimeDeliveryTracker implements DeliveryTracker {
    private DeliveryDriver driver;

    /**
     * Constructor to initialize the RealTimeDeliveryTracker with a delivery driver.
     *
     * @param driver The delivery driver responsible for the order.
     */
    public RealTimeDeliveryTracker(DeliveryDriver driver) {
        this.driver = driver;
    }

    /**
     * Starts the real-time delivery process and message.
     */
    public void startDelivery() {
        System.out.println("Real-time delivery started.");
    }

    /**
     * Tracks the progress of the order while it is in transit.
     */
    public void trackProgress() {
        System.out.println("Order is in transit.");
    }

    /**
     * Completes the delivery process and confirms the successful delivery.
     *here detdrivername from deliverydriver class
     */
    public void completeDelivery() {
        System.out.println(driver.getDriverName() + " has delivered the order successfully.");
    }
}
