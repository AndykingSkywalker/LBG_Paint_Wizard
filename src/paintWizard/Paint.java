package paintWizard;

public abstract class Paint {

	private String name;

	private int volume;

	private double price;

	private double totalCoverage;

	public Paint() {
		super();
	}

	public Paint(String name, int volume, double price, double totalCoverage) {
		super();
		this.name = name;
		this.volume = volume;
		this.price = price;
		this.totalCoverage = totalCoverage;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalCoverage() {
		return totalCoverage;
	}

	public void setTotalCoverage(double totalCoverage) {
		this.totalCoverage = totalCoverage;
	}

	@Override
	public String toString() {
		return "Paint [name=" + name + ", volume=" + volume + ", price=" + price + ", totalCoverage=" + totalCoverage
				+ "]";
	}

}
