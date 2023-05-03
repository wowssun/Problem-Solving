import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();  // 먼저 입력받을 갯수가 될 x를 입력받는다.
// 		int a = 0,b = 0;   // 이것보단
		
		for(int i = 1; i <= x; i ++) { // 1부터 x까지 1씩 증가 하면서
			int a = sc.nextInt();   // 이게 훨씬 깔끔하당
			int b = sc.nextInt();  // a와 b를 입력받는다.
			System.out.println(a+b);   // 입력받은 즉시 계산
		}
			sc.close();		// scanner 입력 끝 꼭 작성하기.
	}

}
