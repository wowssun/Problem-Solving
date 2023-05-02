import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;   // int 합계 선언
		
		for(int i = 1; i <= n; i++ ) { // i는 1부터 n까지 1씩증가
			sum += i;					// i가 sum에 더해짐
		}
			System.out.println(sum);
	}

}