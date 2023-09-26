import java.util.Scanner;
public class Grades {
	public static void main(String[] args)
	{
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("The mark of the student:");
		mark=sc.nextInt();
		if(mark>=90) {
			System.out.println("The grade of the student is A");
		}
		else if(mark>=80&&mark<90) {
			System.out.println("The grade of the student is B");
		}
		else if(mark>=70&&mark<80) {
			System.out.println("The grade of the student is C");
		}
		else if(mark>=60&&mark<70) {
			System.out.println("The grade of the student is D");
		}
		else if(mark>=50&&mark<60) {
			System.out.println("The grade of the student is E");
		}
		else
			System.out.println("The grade of the student is F");
	}
}
