import java.util.HashMap;

public class PhoneNum {
	public static void main(String[] args) {

		// Create a HashMap object called people
		HashMap<String, Long> contacts = new HashMap<String, Long>();

		contacts.put("Sudha", 9003406680l);
		contacts.put("Akshita", 6368212000l);
		contacts.put("Bala", 6986963620l);

		System.out.println(contacts);

		for (String s : contacts.keySet()) {
			System.out.println("Key is : " + s + "Value is :" + contacts.get(s));
		}

		for (Long v : contacts.values()) {
			System.out.println("Values are:   " + v);
		}

		System.out.println(contacts);
		contacts.remove("sudha");
		System.out.println(contacts);

		System.out.println(contacts.get("Akshita"));
	}
}