import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int i = 0;
		
		if (x > 0 && y > 0) {
			i = 1;
		}
		else if(x < 0 && y > 0) {
			i = 2;
		}
		else if(x < 0 && y < 0) {
			i = 3;
		}
		else {
			i = 4;
		}
		
		System.out.println(i);
		sc.close();

	}

}