package yexinya.bigjava.animal;

public class AnimailTest {
	public static void main(String[] args) {
		AnimalList list = new AnimalList();
		Dog d = new Dog("ket");
		Cat c = new Cat("cat");
		c.setSize(45);
		DogKet d1 = new DogKet();
		list.add(d);
		System.out.println(c.getName());
		System.out.println(d1.color);
		System.out.println(c.getSize());
		System.out.println(Dog.getDogCount());
	}
}
