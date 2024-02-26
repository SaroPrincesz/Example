import java.util.Scanner;

public class atLast {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character:  ");
		int a = (int) sc.nextLine().charAt(0);
		if (a > 96) {
			for (int i = a; i <= 122; i++)
				System.out.print((char) i + " ");
		} else {
			for (int i = a; i <= 90; i++)
				System.out.print((char) i + " ");
		}
	}
}