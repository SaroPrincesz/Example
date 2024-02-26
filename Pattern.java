public class Pattern{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter the alphabet:  ");
		char userInput = sc.nextLine().charAt(0);
		int ASCII = (int)userInput;


		if(ASCII>=65 && ASCII <= 90){
			for(int i=ASCII; i>=65; i--){
				for(int j=1; j<=i-64; j++){
					System.out.print((char)i);
				}
				System.out.println();
			}
		}else{
			for(int i=ASCII; i>=97; i--){
				for(int j=1; j<=i-96; j++){
					System.out.print((char)i);
				}
				System.out.println();
			}
		}
	}
}