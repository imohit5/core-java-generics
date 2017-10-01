package wildcardgenericdemo;

import java.util.ArrayList;

public class WildCardDemoTwo {
	
	public static void main(String[] args) {
		WildCardDemoTwo wildCardDemoTwo = new WildCardDemoTwo();
		wildCardDemoTwo.wildCardMethod1(new ArrayList<Thread>()); //can pass 
		wildCardDemoTwo.wildCardMethod2(new ArrayList<String>()); //can pass 
	}

	public void wildCardMethod1(ArrayList<? extends Thread> al) {
		al.add(null);
		//al.add(new WildCardDemoTwo()); // but cannot add
	}
	
	public void wildCardMethod2(ArrayList<?> al) {
		al.add(null);
		//al.add("avc"); // but cannot add
	}

}
