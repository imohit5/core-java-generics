package restrictedgenerics;

public class GenericClassRunnableDemoTest {

	public static void main(String[] args) {

		GenericRunnableClassDemo<Thread> grcd1 = new GenericRunnableClassDemo<Thread>();
//		error because restricted type only to runnable
//		GenericRunnableClassDemo<String> grcd1 = new GenericRunnableClassDemo<String>();
		
		
		
	}

}
