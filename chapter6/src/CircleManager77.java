class Circle77{
	private int x, y, radius;
	public Circle77(int x, int y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public String toString() {
		return "("+x+","+y+")"+"반지름 "+radius;
	}
	public boolean equals(Object obj) {
		Circle77 p = (Circle77)obj;
		if (radius*radius*3.14 == p.radius*p.radius*3.14) return true;
		else return false;
	}
}
public class CircleManager77 {
	public static void main(String[] args) {
		Circle77 a = new Circle77(1,2,10);
		Circle77 b = new Circle77(5,6,10);
		System.out.println("원 1: "+a);
		System.out.println("원 2: "+b);
		if(a.equals(b)) System.out.println("같은 원입니다.");
		else System.out.println("다른 원입니다.");
	}
}
