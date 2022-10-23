package intro_oop;

public class Product {
	private int id;
	private String name;
	private String detail;
	private double unitPrice;
	private double discountRate;
	
	public Product() {
		
	}

	public Product(int id, String name, String detail, double unitPrice, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public double getDiscountedPrice() {
		return unitPrice - (unitPrice * discountRate / 100);
	}
}
