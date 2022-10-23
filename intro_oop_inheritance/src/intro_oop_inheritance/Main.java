package intro_oop_inheritance;

public class Main {

	public static void main(String[] args) {
		CorporateCustomer customer1 = new CorporateCustomer();
		customer1.setId(0);
		customer1.setCustomerNumber("231345");
		customer1.setCompanyName("Hepsiburada");
		customer1.setTaxNumber("3543433219");
		IndividualCustomer customer2 = new IndividualCustomer();
		customer2.setId(0);
		customer2.setCustomerNumber("234365");
		customer2.setNationalIdentity("48604381881");
		customer2.setFirstName("Ömer");
		customer2.setLastName("Yılmaz");
	}

}
