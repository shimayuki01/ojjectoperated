package tokyo;

public class BBB extends fukuoka.AAA { //
	public BBB(int v) {
		super(v); // スーパークラスのコンストラクタで初期化
	}

	//すべての継承フィールドにアクセス可能？
	public void printData() {
		// サブクラスでは、defaultフィールドは利用できない
		// System.out.println(aaa) ;
		System.out.println(bbb); // public
		System.out.println(ccc); // protected
		// サブクラスでは、privateフィールドは利用できない
		// System.out.println(ddd) ;
	}
}