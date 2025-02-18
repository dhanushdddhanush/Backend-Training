package FoodApp;

/**
 * Interface for tracking the delivery proces
 */
interface DeliveryTracker {

    /**
     * Starts the delivery process.
     */
    void startDelivery();

    /**
     * Tracks the progress of the delivery.
     */
    void trackProgress();

    /**
     * Completes the delivery process.
     */
    void completeDelivery();
}
