public class RemoveSpecialCharacterExample2 {
	public static void main(String args[]) {
		String str = "Hello$$$Java+ -Programmer^ ^^-- ^^^ +!";
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
//str=str.replaceAll("\\W", " ")    //we can also use this regular expression  
		System.out.println(str);
		str = str.replaceAll("[-+^]*", " ");
		System.out.println(str);
		str.replaceAll("[^a-zA-Z0-9]", " ");
	}
}