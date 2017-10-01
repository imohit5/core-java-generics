import java.util.ArrayList;

public class TypeCastingProblemsDemo {

	public static void main(String[] args) {

		String[] arr = new String[5];
		arr[0] = "abc";
		arr[1] = "def";
		// arr[2] = 12; //error assigning cannot cast int to string

		ArrayList arrayList = new ArrayList();
		arrayList.add("abc");
		arrayList.add("def");
		arrayList.add(123); // no error at compile

		String string1 = (String) arrayList.get(0);
		String string2 = (String) arrayList.get(1);
		// String string3 = (String) arrayList.get(2); // no error at compile, error at
		// runtime

		// https://stackoverflow.com/questions/339699/java-generics-type-erasure-when-and-what-happens
		// ArrayList<String> will be changed to ArrayList at execution time
		// At execution time there's no way of finding out that T=String for the list
		// object - that information is gone.
		// but the List<T> interface itself still advertises itself as being generic.
		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("abc");
		arrayList1.add("def");
		// arrayList1.add(123); //error at compile time

		String string4 = (String) arrayList1.get(0);
		String string5 = (String) arrayList1.get(1);

	}

}
