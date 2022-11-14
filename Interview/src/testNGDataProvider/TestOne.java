package testNGDataProvider;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOne extends Main {

	static List<Map<String, Integer>> mlist = new ArrayList<>();
	Scanner sc;
	
	@Test(dataProvider = "Student")
	public void printStudentDetails(String name, int age, Map<String, Integer> map) {
		generateReports(name, age, map, totalMarks(map));
		mlist.add(map);
	}
	
	@Test
	public void totalOfDesiredSubjectOfStudents() {
		sc = new Scanner(System.in);
		String sub = sc.nextLine();
		
		for (Map<String, Integer> k : mlist) {
			int s = printIndiviualMark(sub, k);
			sumMarks(s);
		}

		System.out.println(Total);
	}
	
	@DataProvider(name = "Student")
	public Object[][] StudentData(){
		Map<String, Integer> bala_map = new LinkedHashMap<>();
		bala_map.put("Tamil", 89);
		bala_map.put("English", 78);
		bala_map.put("Maths", 100);
		bala_map.put("Science", 89);
		bala_map.put("SocialScience", 90);

		Map<String, Integer> sudha_map = new LinkedHashMap<>();
		sudha_map.put("Tamil", 98);
		sudha_map.put("English", 70);
		sudha_map.put("Maths", 100);
		sudha_map.put("Science", 60);
		sudha_map.put("SocialScience", 70);

		Map<String, Integer> viji_map = new LinkedHashMap<>();
		viji_map.put("Tamil", 96);
		viji_map.put("English", 97);
		viji_map.put("Maths", 100);
		viji_map.put("Science", 90);
		viji_map.put("SocialScience", 98);
		
		return new Object[][]  {
			{"Bala", 31, bala_map},
			{"Sudha", 28, sudha_map },
			{"Viji", 33, viji_map}
		};
		
	}
}
