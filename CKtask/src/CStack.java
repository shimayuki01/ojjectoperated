
public class CStack {

	static int index = 0;
	static int storage[];

	public static void main(String[] args) {
		storage = new int[5];

		CStack.push(3);
		CStack.push(6);
		CStack.push(9);
		push(19);
		push(5);
		
		pop();

		System.out.println(CStack.pop());
		System.out.println(CStack.pop());
		System.out.println(CStack.pop());
		

	}

	public static  void push(int n) {
		//storageがいっぱいだったら終了
		if(storage.length <= index) {
			System.out.println("stack full");
			System.exit(1);
			}

		//現在のindexに入れた後index++
		storage[index++] = n;

	}


	public static  int pop() {
		if(index < 0) {
			System.out.println("stack empty");
			System.exit(1);
		}
		return storage[--index];
	}

}
