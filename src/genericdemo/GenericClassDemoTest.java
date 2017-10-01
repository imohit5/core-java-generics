package genericdemo;

public class GenericClassDemoTest {

	public static void main(String[] args) {

		GenericClassDemo<String> gcd1 = new GenericClassDemo<>("abc");
		gcd1.displayObjectDetail();
		System.out.println(gcd1.getObject());
		
		GenericClassDemo<Integer> gcd2 = new GenericClassDemo<>(123);
		gcd2.displayObjectDetail();
		System.out.println(gcd2.getObject());
		
		GenericClassDemo<Long> gcd3 = new GenericClassDemo<>(123L);
		gcd3.displayObjectDetail();
		System.out.println(gcd3.getObject());
		
		GenericClassDemo<Float> gcd4 = new GenericClassDemo<>(123.45F);
		gcd4.displayObjectDetail();
		System.out.println(gcd4.getObject());
		
		GenericClassDemo<Double> gcd5 = new GenericClassDemo<>(123.45D);
		gcd5.displayObjectDetail();
		System.out.println(gcd5.getObject());
		
	}

}
