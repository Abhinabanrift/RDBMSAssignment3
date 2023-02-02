public class Person1 {
	String name,address;
	Integer age,Id;

	public Person1(String name, String address, Integer age, Integer id) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int compareByAge(Person1 p1, Person1 p2) {
		return p1.getAge().compareTo(p2.getAge());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
