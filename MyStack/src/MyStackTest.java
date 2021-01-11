import java.util.ArrayList;


public class MyStackTest {

	public static void main(String[] args) {
		MyStack2<String> sstk = new MyStack2<>();
		for (int i = 0; i < 10; i++)
			sstk.push("STR-" + i);
		try {
			while (true)
				System.out.println(sstk.pop());
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
			System.out.println("Execution Terminate");
			System.exit(1);
			;
		}

	}

}

class MyStack2<T> { // インスタンス化時に適合させる型Tを指定できるようにする
	int index;
	ArrayList<T> storage; // 総称型の配列は作れないのでArrayListを使用

	public MyStack2() {
		index = 0;
		storage = new ArrayList<T>();
	}

	public void push(T x) {
		// ArrayListは溢れることがないので配列使用時の溢れエラーはなし
		if (index >= storage.size()) {
			// 領域が確保されていない場合には追加
			storage.add(x);
			index++;
		} else {
			// 領域が既に確保されている場合には書き換え
			storage.set(index++, x);
		}
	}

	public T pop() throws StackEmptyException {
		try {
			return storage.get(--index);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new StackEmptyException("Stack Empty");
		}
	}

}

class StackEmptyException extends Exception {
	public StackEmptyException(String msg) {
		super(msg); // getMessageで取得可能
	}
}