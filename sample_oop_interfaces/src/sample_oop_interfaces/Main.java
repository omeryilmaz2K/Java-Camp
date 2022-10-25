package sample_oop_interfaces;

import java.time.LocalDate;

import sample_oop_interfaces.adapter.EDevletServiceAdapter;
import sample_oop_interfaces.business.BaseCampaignManager;
import sample_oop_interfaces.business.BaseGamerManager;
import sample_oop_interfaces.business.CampaignManager;
import sample_oop_interfaces.business.GamerCheckManager;
import sample_oop_interfaces.business.GamerManager;
import sample_oop_interfaces.business.SalesManager;
import sample_oop_interfaces.entities.Campaign;
import sample_oop_interfaces.entities.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
		Gamer gamer1 = new Gamer(0, "Ömer", "Yılmaz", LocalDate.of(2000, 11, 27), "48604381880");
		BaseGamerManager gamerManager = new GamerManager(new EDevletServiceAdapter());
		gamerManager.add(gamer1);
		gamerManager.update(gamer1);
		gamerManager.remove(gamer1);
		Campaign campaign = new Campaign(0, "2 alana 1 bedava", "2 oyun alana bir tane hediye!");
		BaseCampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.remove(campaign);
		SalesManager salesManager = new SalesManager();
		salesManager.sell(gamer1);
		salesManager.sellWithCampaign(gamer1, campaign);
	}

}
