package Steve;

public class ExceptionDemo {
	public static void main(String []args) {
		try {
			String s="123";
			int[] array= new int[5];
			System.out.println(Integer.parseInt(s));
			System.out.println(10/5);
			System.out.println(array[6]);
		}
		catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("Sorry!! Number format");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Sorry!!Arithmetic Exception");
		}
		catch(Exception e) {
			System.out.println("Unexpected Exception happened");
		}
		finally {
			System.out.println("Outcome");
		}
		System.out.println("Next Content");
	}
}
