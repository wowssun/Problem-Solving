import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a = 0,b = 0;
		
		for(int i = 1; i <= x; i ++) {
			 a = sc.nextInt();
			 b = sc.nextInt();
			System.out.println(a+b);
		}
			sc.close();
	}

}