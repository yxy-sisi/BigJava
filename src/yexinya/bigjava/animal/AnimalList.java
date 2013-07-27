package yexinya.bigjava.animal;

public class AnimalList {
	private Animal[] animal = new Animal[5];
	private int nextIndex = 0;

	public void add(Animal a) {
		if (nextIndex < animal.length) {
			animal[nextIndex] = a;
			System.out.println("Animal added at" + nextIndex);
			nextIndex++;
		}
	}
}
