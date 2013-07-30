package yexinya.bigjava.animal;

public class Cat extends Animal{
private int size;

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
		size = 1;
	}

	
}
