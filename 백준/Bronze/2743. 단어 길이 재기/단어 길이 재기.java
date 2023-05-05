import java.util.Scanner;    // 스캐너로 입력받고
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();   //스트링타입으로 입력받는다.
		
		String [] al = new String [a.length()];   //배열 괜히 했다. 이거 말고
	     // System.out.println(a.length());   이렇게 해주면 된다.  
		
		System.out.println(al.length);	// 여기서 a.length가 오류가 났던 이유는 배열은 길이를 .length로 받고 스트링은 .length() 으로 받는다.
									// 추가로 .size로 크기를 받는 것도 있다.
		sc.close();  // 스캐너 닫는거 잊지말기
	}

}
