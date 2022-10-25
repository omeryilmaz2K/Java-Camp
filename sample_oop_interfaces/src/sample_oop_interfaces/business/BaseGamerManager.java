package sample_oop_interfaces.business;

import sample_oop_interfaces.entities.Gamer;

public interface BaseGamerManager {

	void add(Gamer gamer) throws Exception;
	
	void update(Gamer gamer);
	
	void remove(Gamer gamer);
}
