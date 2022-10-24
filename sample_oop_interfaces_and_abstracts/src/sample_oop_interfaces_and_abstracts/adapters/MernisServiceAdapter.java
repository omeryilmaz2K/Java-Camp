package sample_oop_interfaces_and_abstracts.adapters;

import java.rmi.RemoteException;

import sample_oop_interfaces_and_abstracts.abstracts.CustomerCheckService;
import sample_oop_interfaces_and_abstracts.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) throws RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
				customer.getBirthOfDate().getYear());
	}

}
