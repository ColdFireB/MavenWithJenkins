package test;

public class Manip_word {

	//INout : Moscow

	//output : M$sc$$w
	
	
	public static void main(String[] args) {
		String input = "Moscow";
		int count = 1;
		char[] ch = input.toCharArray();
		
		System.out.println(ch);
		
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='o') {
				ch[i]='$';
			}
		}
		
		for(int i=0; i<input.length(); i++) {
			if((input.charAt(i))=='o'){
				char c = input.charAt(i);
				
			}
		}
		
		
	}

}
