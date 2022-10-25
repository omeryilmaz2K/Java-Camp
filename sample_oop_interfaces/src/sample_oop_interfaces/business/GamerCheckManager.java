package sample_oop_interfaces.business;

import java.rmi.RemoteException;

import sample_oop_interfaces.entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) throws RemoteException {
		return true;
	}

}
