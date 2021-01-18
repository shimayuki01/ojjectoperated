public class AccessTest2 {
	public static void main(String[] args) {
		// デフォルトパッケージのAAAと名前が重なるのでクラス完全修飾名
		fukuoka.AAA a = new fukuoka.AAA(10);
		a.printData();
		// default:アクセスできない
		// System.out.println(a.aaa);
		// a.aaa = 100 ;
		// public:これは許可している
		System.out.println(a.bbb);
		a.bbb = 100; // 明示的に許可している
		// protected:アクセスできない
		// System.out.println(a.ccc);
		// private:アクセスできない
		// System.out.println(a.ddd);
		// a.ddd = 100 ; // 変更できない
	}
}