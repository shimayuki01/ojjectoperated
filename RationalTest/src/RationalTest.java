/**
 *
 */

/**
 * @author yuki0
 *
 */
public class RationalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Rational x = new Rational(5,8);
		Rational y = new Rational(3,4);
		Rational z;
		Rational w = new Rational(5,-2);

		System.out.println(x);
		System.out.println(y);

		z = x.add(y);


		System.out.println(x);
		System.out.println(z);

		z = x.sub(y);
		System.out.println("z " + z);
		System.out.println("w "+ w);
		System.out.println("x.mul(y) " + x.mul(y));
		System.out.println("x.div(y) "+ x.div(y));
	}

}

class Rational{
	int den;//分母
	int mol;//分子

	public Rational(int x, int y) {
		//コンストラクタで約分や分母が0や負の時の処理をしておく

		//分母が0または負の時に処理をする
		if(y <= 0) {
			if(y == 0) {//分母が0の時終了する
				System.out.println("分母が0です");
				System.exit(1);
			}
			//分母が負の時分母と分子の正負を入れ替える
			x *= -1;
			y *= -1;
		}

		//約分をする
		for(int i = y;i > 0;i--) {//最大公約数を求めるために降順でforを回す
			if(x % i == 0  &&  y % i == 0) {
				x /= i;
				y /= i;
				break;
			}
		}

		mol = x;
		den = y;

	}

	//有理数の和を求める
	public Rational add(Rational r) {
		int m,d;

		 m = this.mol * r.den + r.mol * this.den;
		 d = this.den * r.den;

		return  new Rational(m,d); //new Rationalとすることでコンストラクタが実行される
	}

	//有理数の差を求める
	public Rational sub(Rational r) {
		int m,d;

		 m = this.mol * r.den - r.mol * this.den;
		 d = this.den * r.den;

		return  new Rational(m,d);
	}

	//有理数の積
	public Rational mul(Rational r) {
		int m,d;

		 m = this.mol * r.mol;
		 d = this.den * r.den;

		return  new Rational(m,d);
	}

	//有理数の商
	public Rational div(Rational r) {
		int m,d;

		 m = this.mol * r.den;
		 d = this.den * r.mol;

		return  new Rational(m,d);
	}

	//有理数の出力表示
	public String toString() {
		if(this.den == 1) {
			return String.valueOf(this.mol);//int型をstringに変えるときstring.valueofを使う
		}
		return this.mol + "/"+ this.den ;//なかにstring型があるときはstring.valueofを使わなくてもよい
	}

}