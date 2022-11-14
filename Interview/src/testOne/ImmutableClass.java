package testOne;

public final class ImmutableClass {

	final String panCardNumber;

	public ImmutableClass(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	
	public String getPanCardNumber() {
		return panCardNumber;
	}
}
