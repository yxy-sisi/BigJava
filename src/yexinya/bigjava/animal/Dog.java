package yexinya.bigjava.animal;

public class Dog extends Animal implements Pet {

	private int size;
	private static int dogCount;

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		dogCount++;
	}

	// related to interface
	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	// normal method
	public void eat() {
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public static int getDogCount() {
		return dogCount;
	}

}
