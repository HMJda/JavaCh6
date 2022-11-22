import java.util.*;
public class Scanner77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = true;
		while(x) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			if(s.equals("exit")) {
				sc.close();
				System.out.println("종료합니다...");
				x = false;				
			}else {
				StringTokenizer st = new StringTokenizer(s," ");
				int count = st.countTokens();
				System.out.println("어절 개수는 "+count);
			}
		}
	}

}
