import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	public static void main(String[] args) {

		Pattern p = Pattern.compile("Test", Pattern.CASE_INSENSITIVE);
		Matcher s = p.matcher("testing special characters");
		boolean b = s.find();

		if (b) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}
}