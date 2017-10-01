package wildcardgenericdemo;

import java.util.ArrayList;

public class WildCardDemoThree {
	
	public static void main(String[] args) {
		WildCardDemoThree wildCardDemoTwo = new WildCardDemoThree();
		wildCardDemoTwo.wildCardMethod(new ArrayList<ExampleA>()); 
	}

	public void wildCardMethod(ArrayList<? super ExampleB> al) {
		al.add(null);
		al.add(new ExampleB()); 
	}
	

}
