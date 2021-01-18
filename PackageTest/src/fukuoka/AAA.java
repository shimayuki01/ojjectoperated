package fukuoka;

public class AAA {

	int aaa; // デフォルト
	public int bbb;
	protected int ccc;
	private int ddd;

	public AAA(int v) {
		aaa = v;
		bbb = v + 1;
		ccc = v + 2;
		ddd = v + 3;
	}

	public void printData() // 当然、すべてのフィールドにアクセス可能
	{
		System.out.println(aaa);
		System.out.println(bbb);
		System.out.println(ccc);
		System.out.println(ddd);
	}
}

class BBB extends AAA {
	public BBB(int v) {
		super(v); // スーパークラスのコンストラクタで初期化
	}

	//すべての継承フィールドにアクセス可能？
	public void printData() {
		System.out.println(aaa);
		System.out.println(bbb);
		System.out.println(ccc);
		// サブクラスでは、privateフィールドは利用できない！！！
		// System.out.println(ddd) ;
	}
}