package sample_oop_interfaces_and_abstracts.concretes;

import sample_oop_interfaces_and_abstracts.abstracts.CustomerCheckService;
import sample_oop_interfaces_and_abstracts.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		return true;
	}

}
