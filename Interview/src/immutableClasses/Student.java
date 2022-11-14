package immutableClasses;

import java.util.HashMap;
import java.util.Map;

public final class Student {
	
	final String name;
	final int age;
	final int total;
	final Map<String, Integer> marks;
	
	public Student(String name, int age, Map<String, Integer> marks, int total) {
		this.name = name;
		this.age = age;
		this.total = total;
		
		Map<String, Integer> tempMap = new HashMap<>();
		
		for(Map.Entry<String, Integer> entry: marks.entrySet()) {
			marks.put(entry.getKey(), entry.getValue());
		}
		
		this.marks = marks;
	}
	
	public int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of Student: "+ name + "\n" + "Age of Student:  "+ age +"\n"+ "Marks of the student:  "+ marks + "\n"
				+ "Total Marks of the Student:  " + total;
	}
		
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}
}
