
public class DumpStack extends SimpleStack {
	// 機能追加するメソッドのみを記述
	public void dump() {
		int i;
		System.out.println("Start: dump");
		for (i = 0; i < index; i++) {
			System.out.println("[" + i + "]: " + storage[i]);
		}
		System.out.println("End: dump");
	}

}