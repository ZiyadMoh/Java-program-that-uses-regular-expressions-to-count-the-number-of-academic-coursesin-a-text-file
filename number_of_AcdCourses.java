import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class number_of_AcdCourses {
	
	public static void printResults(int csc, int cen, int is) {
		
		
		if(csc == 1) 
			System.out.println("Computer Science department  = " + csc + " course");
		else
		System.out.println("Computer Science department = " + csc + " courses");
		
		if(is == 1) 
			System.out.println("Information Systems department = " + is + " course");
		else
		System.out.println("Information Systems department = " + is + " courses");
		
		if(cen == 1) 
			System.out.println("Engineering department = " + cen + " course");
		else
		System.out.println("Engineering department = " + cen + " courses");
		
	}

	static void ACoursesCont(String s) {
		int csc = 0, cen  = 0, is = 0;
		
		String str = s.toLowerCase();
		
		Pattern p1 = Pattern.compile("[^csc]*csc");
		Pattern p2 = Pattern.compile("[^cen]*cen");
		Pattern p3 = Pattern.compile("[^is]*is");
		
		Matcher m1 = p1.matcher(str);
		Matcher m2 = p2.matcher(str);
		Matcher m3 = p3.matcher(str);
		
		while(m1.find())
			csc++;
		while(m2.find())
			cen++;
		while(m3.find())
			is++;	
		 
		printResults(csc, cen, is);
	}
	
	public static void main(String[] args) {
		String str = null;
		try {
			
			File file = new File("C:\\Users\\ziyad\\OneDrive\\Desktop\\KSU\\Comp\\academiccourses.txt");
			Scanner s = new Scanner(file);
			while(s.hasNextLine()) {
				str += s.nextLine();
			}
		}catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		ACoursesCont(str);
		
		
		
	}
}



