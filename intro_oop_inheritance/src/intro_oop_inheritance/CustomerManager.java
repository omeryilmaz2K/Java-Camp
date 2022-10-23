package intro_oop_inheritance;

public class CustomerManager {
	
//	public void add(IndividualCustomer customer) {
//		System.out.println(customer.customerNumber + "numaralı müşteri eklendi.");
//	}
//
//	public void add(CorporateCustomer customer) {
//		System.out.println(customer.customerNumber + "numaralı müşteri eklendi.");
//	}
//
//	SOLID -> Open/Closed Principle 
//	Yeni bir özellik eklendiğinde var olan sistemde hiç bir yapı değişmemeli!
	
	public void add(Customer customer) {
		System.out.println(customer.getCustomerNumber() + " kaydedildi.");
	}
	
	// bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
