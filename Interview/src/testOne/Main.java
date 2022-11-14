package testOne;

public class Main {
	public static void main(String ar[])  {
		ImmutableClass im = new ImmutableClass("Blaster123");
		String s = im.getPanCardNumber();
		System.out.println("Pan card number:  "  + s);
	}
}