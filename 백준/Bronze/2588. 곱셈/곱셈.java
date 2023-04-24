import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		System.out.println(a*(b%10));  // b%10을 하면 385중 마지막 자리만 얻을 수 있다.
		System.out.println(a*((b/10)%10)); // b/10을 하면 마지막 자리만 뺀 값을 얻을 수 있다.
		System.out.println(a*(((b/10)/10)%10));
		System.out.println(a * b);

		sc.close();
	}
}