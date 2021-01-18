package fukuoka;
public class AccessTest1 {
	public static void main(String[] args) {
		AAA a = new AAA(10);
		a.printData();
		// default:他のクラスの中身が見えてしまう
		System.out.println(a.aaa);
		a.aaa = 100; // 変更もできてしまう
		// public:これは許可している
		System.out.println(a.bbb);
		a.bbb = 100; // 明示的に許可している
		// protected:他のクラスの中身が見えてしまう
		System.out.println(a.ccc);
		// private のみ見えない
		// System.out.println(a.ddd);
		// a.ddd = 100 ; // 変更できない
	}
}