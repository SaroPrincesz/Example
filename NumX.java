 import java.util.Scanner;
public class NumX{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		String str = Integer.toString(n);
		int len = str.length();
		int count = 1;
		System.out.println();
/*		if input = 23456;
		sample output:-
			2   6
			 3 5
			  4
			 3 5
			2   6      */
		for(int i=0;i<len; i++){
			for (int j=0; j<len; j++){
				if(i==j){
					System.out.print(str.charAt(i));
				}else if(i+j == len-1){
					System.out.print(str.charAt(j));
				}else{
					System.out.print(" ");
				}
				// if(i==j || i+j == 6){
				//	System.out.print("*");
				//}else{
				//	System.out.print(" ");
				//}
			}
			System.out.println();
		}


		/*  1   5
		     2 4
		      3
		     2 4
		    1   5         */
		/*for(int i=1;i<=n; i++){
			for (int j=1; j<=n; j++){
				if(i==j){
					System.out.print(i);
				}else if(i+j == n+1){
					System.out.print(j);
				}else{
					System.out.print(" ");
				}
				// if(i==j || i+j == 6){
				//	System.out.print("*");
				//}else{
				//	System.out.print(" ");
				//}
			}
			System.out.println();
		} */


		/*   1
		     2 3
		     4 5 6
		     7 8 9 10   */
	/*	for(int i=1; i<=n; i++){
			for (int j=1; j<=i; j++){
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		} */


		/*    * * * * *
		        * * *
		          *
		        * * *
		      * * * * *           */
	/*	for(int i=n; i>0; i--){
			for(int j=n; j>i; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<n; i++){
			for(int j=i; j<n-1; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=2*i+1; k++){
				System.out.print("*");
			}
			System.out.println();
		} */


		/*   * * *
		     * *
		     *
		     * *
		     * * *         */

	/*	for(int i=n; i>=1; i--){
			for(int k=1; k<=i; k++){
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=2; i<=n; i++){
			
			for(int k=i; k>=1; k--){
				System.out.print(" *");
			}
			System.out.println();
		} */
	}
}