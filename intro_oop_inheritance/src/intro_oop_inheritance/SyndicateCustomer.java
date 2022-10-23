package intro_oop_inheritance;

public class SyndicateCustomer extends Customer {
	private String syndicateName;

	public String getSyndicateName() {
		return syndicateName;
	}

	public void setSyndicateName(String syndicateName) {
		this.syndicateName = syndicateName;
	}
}
