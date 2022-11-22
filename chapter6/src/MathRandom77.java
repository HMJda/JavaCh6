import java.util.*;
public class MathRandom77 {

	public static void main(String[] args) {
		boolean x = true;
		while(x) {
			Scanner sc = new Scanner(System.in);
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			int i = sc.nextInt();
			int r = (int)(Math.random()*3);
			String[] s = {"가위","바위","보"};
			switch(i) {
			case 1:				
				System.out.println("사용자 "+s[i-1]+" : 컴퓨터 "+s[r] );
				if(r == 0) {
					System.out.println("사용자가 비겼습니다.");
				}else if(r == 1) {
					System.out.println("사용자가 졌습니다.");
				}else {
					System.out.println("사용자가 이겼습니다.");
				}
				break;
			case 2:
				System.out.println("사용자 "+s[i-1]+" : 컴퓨터 "+s[r] );
				if(r == 1) {
					System.out.println("사용자가 비겼습니다.");
				}else if(r == 2) {
					System.out.println("사용자가 졌습니다.");
				}else {
					System.out.println("사용자가 이겼습니다.");
				}
				break;
			case 3:
				System.out.println("사용자 "+s[i-1]+" : 컴퓨터 "+s[r] );
				if(r == 2) {
					System.out.println("사용자가 비겼습니다.");
				}else if(r == 0) {
					System.out.println("사용자가 졌습니다.");
				}else {
					System.out.println("사용자가 이겼습니다.");
				}
				break;
			case 4:
				x = false;
				sc.close();
				System.out.println("게임을 종료합니다...");
				break;
			default:
				System.out.println("잘못입력하셨습니다...");
				break;
			}
			
		}
	}

}
