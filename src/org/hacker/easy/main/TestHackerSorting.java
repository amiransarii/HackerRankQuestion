package org.hacker.easy.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestHackerSorting {
	
	public static void main(String args[]) {
		
		List<Student> studeList = Arrays.asList(new Student(2, "Amir Ansari", 10),
				
				new Student(1, "Amir Ansari", 10),new Student(3, "Faisla Ansari", 9),
				new Student(1, "Matiulla Ansari", 8),new Student(1, "Izzar Ansari", 9));
		
		
		   studeList.sort((Student s1,Student s2)->{
			   
			    if(s1.getCgpa() != s2.getCgpa()) {
			    	 return Double.compare(s2.getCgpa(), s1.getCgpa());	
			    }
			    
			    else if(!s1.getFname().equals(s2.getFname())) {
			    	return s1.getFname().compareTo(s2.getFname());
			    }
			    else {
			    	return s1.getId() -s2.getId();
			    }
		   });
		
		
		
		studeList.forEach(student ->{
			System.out.println(student.getId() +" "+student.getFname() +" "+student.getCgpa());
			
		});
		 
		 int n =0;
		 int p = 0;
		
		  long result = (long)Math.pow(n,p); 
		
		
		
	}

}


class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}