package genericdemo;

public class GenericClassDemo<T> {

	T gcd;

	public GenericClassDemo(T gcd) {
		this.gcd = gcd;
	}

	public void displayObjectDetail() {
		System.out.println("object type: " + gcd.getClass().getName());
	}

	public T getObject() {
		return gcd;

	}

}
