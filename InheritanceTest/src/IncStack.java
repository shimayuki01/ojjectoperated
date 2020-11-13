
public class IncStack extends DumpStack {
	// 機能変更：メソッドの上書：オーバーライド
	public void push(int x) {
		// 同じことは２度書かない
		super.push(x + 1); // スーパークラスの機能を利用して実現
	}

}