package app;
import lib.Calculator77;

public class GoodCalc77 extends Calculator77 {
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0;i < a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator77 c = new GoodCalc77();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}

}
