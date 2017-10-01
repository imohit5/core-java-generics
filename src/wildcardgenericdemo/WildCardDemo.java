package wildcardgenericdemo;

import java.util.ArrayList;

public class WildCardDemo {

	public void wildCardMethod(ArrayList<?> al) {
		al.add(null);
//		only null can be added
//		al.add("abc");
//		al.add(123);
	}

}
