package sample_oop_interfaces.business;

import java.rmi.RemoteException;

import sample_oop_interfaces.entities.Gamer;

public interface GamerCheckService {
	
	boolean checkIfRealGamer(Gamer gamer) throws RemoteException;
}
