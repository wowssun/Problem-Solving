import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();
		
		for(int i = 0; i < N; i++) {
			for(int j = 1; j < N-i; j++) {
				System.out.print(" ");
			}
			for(int a = 0; a < 2*i+1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}