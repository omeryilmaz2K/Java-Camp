package sample_oop_interfaces_and_abstracts.abstracts;

import java.rmi.RemoteException;

import sample_oop_interfaces_and_abstracts.entities.Customer;

public interface CustomerCheckService {

	boolean checkIfRealCustomer(Customer customer) throws Exception;
}
