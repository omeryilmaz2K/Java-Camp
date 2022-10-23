package intro_oop_interfaces;

public class CustomerManager {
//	private Logger logger;
	private Logger[] loggers;
	
// 	Dependency Injection
//	public CustomerManager(Logger logger) {
//		this.logger = logger;
//	}
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

// 	loosely (gevşekce) - tightly (sıkıca) coupled (birleştirilmiş)
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getFirstName());
//		logger.log(customer.getFirstName());
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi " + customer.getFirstName());
//		logger.log(customer.getFirstName());
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName());
	}
}
