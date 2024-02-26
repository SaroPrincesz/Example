import java.util.Scanner;

public class numReverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int userInput = sc.nextInt();
		int temp = userInput;
		int remaining =0;
		int reverseNumber = 0;
		
		while(temp != 0){
			remaining = temp%10;
			temp /= 10;
			reverseNumber = reverseNumber * 10 + remaining;		
		}
	
		System.out.println("userInput:  "+userInput);
		System.out.println("reverseNumber:  "+reverseNumber);
	System.out.println("Output:  "+(userInput - reverseNumber));
	}
}