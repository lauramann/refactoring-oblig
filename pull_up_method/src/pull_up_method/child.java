package pull_up_method;

public class child extends PullUp {


	public child(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	
 private static int num=3;
	
	public static int calc() {
		return num+2;
	}
	
	public static void main(String[] args) {
		System.out.println(calc());
	}
}
