package sample_oop_interfaces.adapter;

import java.rmi.RemoteException;

import sample_oop_interfaces.business.GamerCheckService;
import sample_oop_interfaces.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class EDevletServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) throws RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthOfDate().getYear());
	}

}
