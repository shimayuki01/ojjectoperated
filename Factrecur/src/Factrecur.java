/**
 *
 */

/**
 * @author yuki0
 *
 */
public class Factrecur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//引数が入っていなければ終了
		if(args.length <= 0) {
			System.out.println("引数が入ってません");
			System.exit(1);
		}
		System.out.println("[" + args[0] + "]" + Factrecur.fact(Integer.parseInt(args[0])));

	}
	//再帰関数を用いて階乗を求める
	public static int fact(int n) {
		if(n <= 0) {
			return 1;
		}
		return n * Factrecur.fact(n-1);
	}

}
