
public class JavaStackTest {

	public static void main(String[] args) {
		JavaStack.init();

		JavaStack.push(9);
		JavaStack.push(97);
		JavaStack.push(1);

		System.out.println(JavaStack.pop());
		System.out.println(JavaStack.pop());
		System.out.println(JavaStack.pop());

	}

}
class JavaStack{
	static int index;
	static int storage[];

	public static void init() {
		index = 0 ;
		storage = new int[10] ;
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
