package yexinya.bigjava.animal;

public class AnimailTest {
	public static void main(String[] args) {
		AnimalList list = new AnimalList();
		Dog d = new Dog();
		Cat c = new Cat();
		list.add(d);
		System.out.println(c.toString());
	}
}
