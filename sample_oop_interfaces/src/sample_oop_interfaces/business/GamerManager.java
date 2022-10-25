package sample_oop_interfaces.business;

import sample_oop_interfaces.entities.Gamer;

public class GamerManager implements BaseGamerManager {
	private GamerCheckService checkService;
	
	public GamerManager(GamerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void add(Gamer gamer) throws Exception {
		if (checkService.checkIfRealGamer(gamer))
			System.out.println(gamer.getFirstName() + " başarıyla kayıt edildi.");
		else
			throw new Exception("Geçerli bir oyuncu bilgisi girilmedi");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " başarıyla güncellendi.");
	}

	@Override
	public void remove(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " kullanıcısının kaydı silindi.");
	}

}
