public class RationalTest {
	public static void main(String[] args) {
		Rational x = new Rational(2,6) ; // 2/6
		Rational y= new Rational (1,2) ; // 1/2
		Rational z = new Rational (3) ; // 整 数 値 3/1

		System.out.println(x) ;
		System.out.println(y) ;
		System.out.println(z);

		System.out.println("加算テスト");
		x.add(y);
		System.out.println(x);
		x.add(2);
		System.out.println(x);
		x.add(z);
		System.out.println(x);

		System.out.println("演算子的利用");

		System.out.println("y + z" + Rational.add(y, z));

		System.out.println("判定テスト");
		System.out.println("x = 0" + x.Zero());
		System.out.println("y < z" + y.lessThan(z));

	}
}

class Rational{
	int den;//分母
	int mol;//分子

	public Rational(int x, int y) {

		this.mol = x;
		this.den = y;

		correct(this);
	}

    //整数を有理数に変換する
	public Rational(int x) {
		this(x,1);
	}

	//最小公約数を求める
	int gcd ( int a , int b ) {
		 if ( b == 0 )
			 return a ;

		 return gcd ( b , a % b ) ;
	}

	Rational correct(Rational r) {

			//約分をする
			int n;

			n = gcd(r.mol,r.den);
			r.den /= n;
			r.mol /= n;

			//分母が0または負の時に処理をする
			if(r.den <= 0) {
				if(r.den == 0) {//分母が0の時終了する
					System.out.println("分母が0です");
					System.exit(1);
				}
				//分母が負の時分母と分子の正負を入れ替える
				r.den *= -1;
				r.mol *= -1;
			}
			return r;
	 }

	//有理数の和を求める
	public Rational add(Rational r) {

		 this.mol = this.mol * r.den + r.mol * this.den;
		 this.den = this.den * r.den;

		return  correct(this);
	}

	//整数が来た時の和を求める
	public Rational add(int x) {
		Rational rat  = new Rational(x);

		return this.add(rat);
	}

	//演算子的利用
	public static Rational add(Rational a,Rational b) {
		Rational rat = new Rational(a.mol, a.den);

		return rat.add(b);
	}


	//有理数の差を求める
	public Rational sub(Rational r) {
		 this.mol = this.mol * r.den - r.mol * this.den;
		 this.den = this.den * r.den;

		return  correct(this);
	}

	//整数が来た時の差を求める
	public Rational sub(int x) {
		Rational rat  = new Rational(x);

			return this.sub(rat);
	}

	//演算子的利用
	public static Rational sub(Rational a,Rational b) {
		Rational rat = new Rational(a.mol, a.den);

		return rat.sub(b);
	}


	//有理数の積
	public Rational mul(Rational r) {
		 this.mol = this.mol * r.mol;
		 this.den = this.den * r.den;

		return  correct(this);
	}

	//整数が来た時の積を求める
	public Rational mul(int x) {
		Rational rat  = new Rational(x);

		return this.mul(rat);
	}

	//演算子的利用
	public static Rational mul(Rational a,Rational b) {
		Rational rat = new Rational(a.mol, a.den);

		return rat.mul(b);
	}


	//有理数の商
	public Rational div(Rational r) {
		 this.mol = this.mol * r.den;
		 this.den = this.den * r.mol;

		return  correct(this);
	}

	//整数が来た時の商を求める
	public Rational div(int x) {
		Rational rat  = new Rational(x);

		return this.div(rat);
	}

	//演算子的利用
	public static Rational div(Rational a,Rational b) {
		Rational rat = new Rational(a.mol, a.den);

		return rat.div(b);
	}

	//有理数の出力表示
	public String toString() {
		if(this.den == 1) {
			return String.valueOf(this.mol);//int型をstringに変えるときstring.valueofを使う
		}
		return this.mol + "/"+ this.den ;//なかにstring型があるときはstring.valueofを使わなくてもよい
	}

	//インスタンスが０か否か判定
	public boolean Zero() {
		return (this.mol == 0);
	}

	public boolean lessThan(Rational r) {
		int x;
		x = this.mol * r.den - r.mol * this.den;

		return (x < 0);
	}

}