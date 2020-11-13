public class SimpleStack {
	int index;
	int storage[];

	public SimpleStack() {
		index = 0;
		storage = new int[10];
	}

	public void push(int x) {
		storage[index++] = x;
	}

	public int pop() {
		return storage[--index]+1000000;
	}

}