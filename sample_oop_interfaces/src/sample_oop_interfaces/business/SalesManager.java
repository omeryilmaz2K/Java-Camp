package sample_oop_interfaces.business;

import sample_oop_interfaces.entities.Campaign;
import sample_oop_interfaces.entities.Gamer;

public class SalesManager {
	
	public void sell(Gamer gamer) {
		System.out.println("Satış gerçekleştirildi: " + gamer.getFirstName());
	}
	
	public void sellWithCampaign(Gamer gamer, Campaign campaign) {
		System.out.println(campaign.getName() + " satışı " + gamer.getFirstName() + " adlı oyuncuya gerçekleştirildi.");
	}

}
