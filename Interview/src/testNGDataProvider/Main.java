package testNGDataProvider;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Student stud;
	static int Total;

	public static void generateReports(String name, int age, Map<String, Integer> map, int total) {
		stud = new Student(name, age, map, total);
		System.out.println(stud);
	}

	public static int totalMarks(Map<String, Integer> map) {
		int sum = 0;

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			sum = sum + m.getValue();
		}
		return sum;
	}

	public static int printIndiviualMark(String subject, Map<String, Integer> map) {
		int ls = 0;

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getKey().equals(subject)) {
				ls = m.getValue();
				System.out.println(m.getValue());
			}
		}
		return ls;
	}

	public static void sumMarks(int mark) {
		Total = Total + mark;
	}
}
