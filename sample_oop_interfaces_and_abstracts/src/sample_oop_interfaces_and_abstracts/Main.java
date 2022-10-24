package sample_oop_interfaces_and_abstracts;

import java.time.LocalDate;

import sample_oop_interfaces_and_abstracts.abstracts.BaseCustomerManager;
import sample_oop_interfaces_and_abstracts.adapters.MernisServiceAdapter;
import sample_oop_interfaces_and_abstracts.concretes.CustomerCheckManager;
import sample_oop_interfaces_and_abstracts.concretes.NeroCustomerManager;
import sample_oop_interfaces_and_abstracts.concretes.StarbucksCustomerManager;
import sample_oop_interfaces_and_abstracts.entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(0, "Ömer", "Yılmaz", LocalDate.of(2000, 11, 27), "48604381880"));
		
//		Unit Test için fake mernis kontrol sistemi -> CustomerCheckManager
//		BaseCustomerManager baseCustomerManager2 = new StarbucksCustomerManager(new CustomerCheckManager());
//		baseCustomerManager2.save(new Customer(0, "Ömer", "Yılmaz", LocalDate.of(2001, 11, 27), "48604381881"));		
	}

}
