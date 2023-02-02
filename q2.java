import java.util.ArrayList;
import java.util.Collections;

class comparingMethods {
	public int compareByName(Person1 p1, Person1 p2) {
		return p1.getName().compareTo(p2.getName());
	}

	public int compareByAge(Person1 p1, Person1 p2) {
		return p1.getAge().compareTo(p2.getAge());
	}

	public static int compareById(Person1 p1, Person1 p2) {
		return p1.getId().compareTo(p2.getId());
	}

	public static int compareByAddress(Person1 p1, Person1 p2) {
		return p1.getAddress().compareTo(p2.getAddress());
	}
}

public class q2 {

	public static void main(String[] args) {
		Person1 p1 = new Person1("argha", "assdasd", 40, 1212);
		Person1 p2 = new Person1("argha2", "assdasd4", 20, 1347212);
		Person1 p3 = new Person1("argha3", "assdasd3", 10, 1341212);
		Person1 p4 = new Person1("argha4", "assdasd2", 30, 1341247452);
		ArrayList<Person1> al = new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		comparingMethods cmp = new comparingMethods();
		Collections.sort(al, cmp::compareByAge);
		System.out.println("After sorting by age: ");
		al.stream().map(x -> x.getName()).forEach(System.out::println);
		Collections.sort(al, cmp::compareByName);
		System.out.println("After sorting by name: ");
		al.stream().map(x -> x.getName()).forEach(System.out::println);
		Collections.sort(al, comparingMethods::compareById);
		System.out.println("After sorting by Id: ");
		al.stream().map(x -> x.getName()).forEach(System.out::println);
		Collections.sort(al, comparingMethods::compareByAddress);
		System.out.println("After sorting by Address: ");
		al.stream().map(x -> x.getName()).forEach(System.out::println);
	}

}
