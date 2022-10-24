package sample_oop_interfaces_and_abstracts.abstracts;

import sample_oop_interfaces_and_abstracts.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Veri tabanına kaydedildi: " + customer.getFirstName());
	}

}
