
public class JavaFact {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("[" +args[0] + "]" + Fact.fact(Integer.parseInt(args[0])));
	}

}
//階乗を計算するFactを定義
class Fact{
	//階乗を計算する
	public static int fact(int n) {
		if(n <= 0)
			return 1;

		return n * Fact.fact(n - 1);
	}
}