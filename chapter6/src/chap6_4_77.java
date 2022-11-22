import java.util.*;
public class chap6_4_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum = 0;
		StringTokenizer st = new StringTokenizer(s,"+");
		while(st.hasMoreTokens()) {
			String num = st.nextToken();
			num = num.trim();
			sum += Integer.parseInt(num);		
		}
		System.out.println("гую╨ "+ sum);
		sc.close();
	}

}
