package pull_up_method;

public class child extends PullUp {
	
	// Make instance of pullUp class and alter num variable
	PullUp test = new PullUp();
	int num = test.num -2;

	// calc method, returns num + 2
	// (method to pull up)
	public int calc() {
		return num+2;
	}
	
	// prints calc result 
	public void main(String[] args) {
		System.out.println(calc());
	}
}
