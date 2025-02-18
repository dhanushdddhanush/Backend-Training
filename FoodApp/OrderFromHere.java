package FoodApp;

import java.util.Scanner;

/**
 * The main class that runs the Food App.
 */
public class OrderFromHere {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Enter Your name:");
		String custname = scanner.next();
		Customer customer = new Customer(custname, "7989679464");
		/*
		 * Customer log in, registers
		 */
		customer.login();
		customer.register();
		customer.viewProfile();
		System.out.println("\n");
		System.out.println("Enter from which restaurant you want to order:");
		String restname = scanner.next();
		Restaurant restaurant = new Restaurant(restname, "9999999999");
		DeliveryDriver driver = new DeliveryDriver("Ramesh", "9111457788");
		Payment payment = new Payment();

		/*
		 * Customer selects an item
		 */
		Menu.list();
		System.out.println("\n");
		System.out.println("Choose your order from above menu or the item you want:");
		String selectedItem = scanner.next();
		customer.placeOrder(selectedItem);

		/*
		 * Restaurant prepares the order
		 */
		restaurant.login();
		restaurant.prepareOrder(selectedItem);

		/*
		 * Driver accepts order
		 */
		System.out.println("\n");
		driver.assign();
		driver.login();
		driver.acceptOrder(selectedItem);
		/*
		 * Realtime delivery stARTED
		 */
		 RealTimeDeliveryTracker tracker = new RealTimeDeliveryTracker(driver);
		 System.out.println("\n");
		tracker.startDelivery();
		tracker.trackProgress();
		tracker.completeDelivery();
		

		/*
		 * payment
		 */
		payment.processPayment(299.99);

		scanner.close();
	}
}
