
public class JavaManyStackTest {

	public static void main(String[] args) {
		//複数のインスタンス・オブジェクトを生成
		JavaManyStack stk = new JavaManyStack();
		JavaManyStack abc = new JavaManyStack(10);

		stk.push(9);
		stk.push(10);
		abc.push(8);
		abc.push(87);

		//System.out.println("classObject " + JavaManyStack.pop());
		System.out.println("stk "+ stk.pop());
		System.out.println("stk "+ stk.pop());
		System.out.println("abc "+ abc.pop());
		System.out.println("abc "+ abc.pop());

		System.out.println(stk);

	}

}
class JavaManyStack{
	  int index;
	  int storage[];

	public JavaManyStack() {
		this(5);
	}
	public JavaManyStack(int n) {
		System.out.println("コンストラクタ実行");//コンストラクタ実行確認
		this.index = 0 ;
		this.storage = new int[n] ;
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

	//自己出力表現（スタックの数を表示するように上書き）
	public String toString() {
		return "JavaManyStack{index=" + index + "}";
		}

}
