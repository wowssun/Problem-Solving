import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			// int n을 입력받는다.
		
			for(int i = 1; i < 10; i++) { 		// i는 1부터 9까지 
				System.out.println(n + " * " + i + " = " + n*i);
				
				sc.close();
		}
	}

}