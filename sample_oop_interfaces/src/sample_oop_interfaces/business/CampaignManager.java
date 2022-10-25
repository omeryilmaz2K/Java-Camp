package sample_oop_interfaces.business;

import sample_oop_interfaces.entities.Campaign;

public class CampaignManager implements BaseCampaignManager {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya başarıyla oluşturuldu: " + campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya başarıyla güncellendi: " + campaign.getName());
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Kampanya kaydı silindi: " + campaign.getName());
	}

}
