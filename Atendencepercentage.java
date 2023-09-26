import java.util.Scanner;
public class AttendencePercentage {
	public static void main(String args[])
	{
		int attendence;
		float mark=10f;
		Scanner sc=new Scanner(System.in);
		System.out.println("The attendence percentage is :");
		attendence=sc.nextInt();
		if(attendence>=90){
			System.out.println("The grade is:"+mark);
		}
		else
		{
			mark=(float)attendence/10;
			System.out.println("The grade is"+mark);
		}	
	}
}
