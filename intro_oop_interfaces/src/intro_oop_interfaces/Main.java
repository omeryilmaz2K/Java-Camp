package intro_oop_interfaces;

public class Main {

	public static void main(String[] args) {
//		Logger[] loggers = { new EmailLogger(), new DatabaseLogger() };
		CustomerManager manager = new CustomerManager(new Logger[] {new DatabaseLogger(), new EmailLogger()});
		Customer customer = new Customer(0, "Ömer", "Yılmaz");
		manager.add(customer);
	}

}
