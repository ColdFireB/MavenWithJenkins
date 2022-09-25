import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Miracle {
	public static void main(String[] args) {

		// Create a HashMap object called people
		HashMap<String, List<String>> contacts = new HashMap<String, List<String>>();

		List<String> movie = new ArrayList<>();

		movie.add("Kaththi");
		movie.add("Master");
		movie.add("Vikram");

		contacts.put("Sudha", movie);
		// contacts.put("Akshita", movie);
		// contacts.put("Bala", movie);

		System.out.println(contacts);

		for (String s : contacts.keySet()) {
			System.out.println("Key is : " + s + "Value is :" + contacts.get(s).get(1));
		}

	}
}
