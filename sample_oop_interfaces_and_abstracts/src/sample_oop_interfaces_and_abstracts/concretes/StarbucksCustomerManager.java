package sample_oop_interfaces_and_abstracts.concretes;

import sample_oop_interfaces_and_abstracts.abstracts.BaseCustomerManager;
import sample_oop_interfaces_and_abstracts.abstracts.CustomerCheckService;
import sample_oop_interfaces_and_abstracts.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager { // implements CustomerCheckService
	private CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if (checkService.checkIfRealCustomer(customer))
			super.save(customer);
		else
			throw new Exception("Gerçek bir müşteri girilmedi!");
	}

}
