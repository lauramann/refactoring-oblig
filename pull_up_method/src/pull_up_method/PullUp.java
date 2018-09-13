package pull_up_method;

public class PullUp {

	protected static int num =4;

	public PullUp(int num) {
		super();
		this.num = num;
	}
	
	public static void main(String[] args) {
		int number = child.calc();
		System.out.println(number);
	}
	
	public static int calc() {
		return num+2;
	}

}
