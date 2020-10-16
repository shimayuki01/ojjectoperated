
public class JavaManyStackTest {

	public static void main(String[] args) {
		//複数のインスタンス・オブジェクトを生成
		JavaManyStack stk = new JavaManyStack();
		JavaManyStack abc = new JavaManyStack();

		stk.push(9);
		stk.push(10);
		abc.push(8);
		abc.push(87);

		//System.out.println("classObject " + JavaManyStack.pop());
		System.out.println("stk "+ stk.pop());
		System.out.println("stk "+ stk.pop());
		System.out.println("abc "+ abc.pop());
		System.out.println("abc "+ abc.pop());


	}

}
class JavaManyStack{
	  int index;
	  int storage[];

	public JavaManyStack() {
		System.out.println("コンストラクタ実行");//コンストラクタ実行確認
		index = 0 ;
		storage = new int[10] ;
	}
	public void push(int n) {
		//storageがいっぱいだったら終了
		if(storage.length <= index) {
			System.out.println("stack full");
			System.exit(1);
			}

		//現在のindexに入れた後index++
		storage[index++] = n;

	}
	public int pop() {
		if(index <= 0) {
			System.out.println("stack empty");
			System.exit(1);
		}
		return storage[--index];
	}

}
