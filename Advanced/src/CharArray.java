
public class CharArray {

	public String reverseString(String s) {
		String reversed = "";
		char ch[] = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			reversed = reversed + ch[i];
		}
		return reversed;
	}

	public static void main(String[] args) {

		String str = "this is a test";

		CharArray ob = new CharArray();

		System.out.println(ob.reverseString(str));

	}

}
