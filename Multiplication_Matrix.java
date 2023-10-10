/*file			:	Matrix_Multiplication.java
 * Author		:	Steve Thomas
 * version		:	1.0
 * description	:	to find the Product of 2 Matrix
 * date			:	10/10/23
 */
import java.util.Scanner;
public class Multiplication_Matrix {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the 1st matrix:");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int firstmatrix[][]=new int[r1][c1];
		System.out.println("Enter the rows and cols of the 1st matrix:");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
			firstmatrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the order of 2nd matrix:");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int secondmatrix[][]=new int[r2][c2];
		System.out.println("Enter the rows and cols of the 2nd matrix:");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				secondmatrix[i][j]=sc.nextInt();
			}
		}
        if(c1!=r2) {
			System.out.println("Enter Multiplication is not possible:");
		}
        else {
        	System.out.println("Enter multiplication is Possible:");
        int product[][]=new int[r1][c2];
        System.out.println("Product of the 2 matrix are:");
        for(int i=0;i<r1;i++) {
        	for(int j=0;j<c2;j++) {
        		product[i][j]=0;
        		for(int k=0;k<c1;k++) {
        			product[i][j]+=firstmatrix[i][k]*secondmatrix[k][i];
        		}
        	}
        }
        for(int i=0;i<r1;i++) {
        	for(int j=0;j<c1;j++) {
        		System.out.print("\t"+product[i][j]);
        	}
        	System.out.print("\n");
        }
        }
	}
}

