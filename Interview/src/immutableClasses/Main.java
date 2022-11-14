package immutableClasses;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	static Student stud;
	
	public static void generateReports(String name, int age, Map<String, Integer> map, int total) {
		 	stud = new Student(name, age, map, total);
			System.out.println(stud);
	}
	
	public static int totalMarks(Map<String, Integer> map) {
		int sum =0;
		
		for(Map.Entry<String, Integer> m: map.entrySet()) {
			sum = sum + m.getValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> bala_map = new LinkedHashMap<>();
		bala_map.put("Tamil", 89);
		bala_map.put("English", 78);
		bala_map.put("Maths", 99);
		bala_map.put("Science", 89);
		bala_map.put("SocialScience", 90);
		
		Map<String, Integer> sudha_map = new LinkedHashMap<>();
		sudha_map.put("Tamil", 98);
		sudha_map.put("English", 70);
		sudha_map.put("Maths", 87);
		sudha_map.put("Science", 60);
		sudha_map.put("SocialScience", 70);
		
		Map<String, Integer> viji_map = new LinkedHashMap<>();
		viji_map.put("Tamil", 96);
		viji_map.put("English", 97);
		viji_map.put("Maths", 100);
		viji_map.put("Science", 90);
		viji_map.put("SocialScience", 98);

		generateReports("Bala", 18, bala_map, totalMarks(bala_map));
		generateReports("Sudha", 15, sudha_map, totalMarks(sudha_map));
		generateReports("Viji", 20, viji_map, totalMarks(viji_map));		
	}
}
