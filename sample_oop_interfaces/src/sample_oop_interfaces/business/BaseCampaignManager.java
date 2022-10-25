package sample_oop_interfaces.business;

import sample_oop_interfaces.entities.Campaign;

public interface BaseCampaignManager {
	
	void add(Campaign campaign);
	
	void update(Campaign campaign);
	
	void remove(Campaign campaign);
}
