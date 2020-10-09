
public class KionStat2 {
	static double kion[];//配列の作成


	public static void main(String[] args) {
		kion = new double []{12.8,12.0,11.4,11.2,10.6,10.6,10.3,10.6,
			13.1,16.9,20.1,22.2,21.9,22.5,23.9,24.1,
			22.9,21.9,20.1,18.9,17.6,17.0,16.4,15.7};

		for(int i = 0;i < kion.length;i++) {
			System.out.println(kion[i]);
		}

		System.out.println("平均" + ave());
		System.out.println("最高気温" + max());
		System.out.println("最低気温" + min());

	}

	public static double ave() {//平均気温を求める
		double sum = 0;

		for(int i=0;i < kion.length;i++) {
			sum += kion[i];
		}
		return sum/kion.length;
	}

	public static double max() {//最高気温を求める
		double maxk = kion[0];//配列の０番目を初期値にする

		for(int i = 1;i < kion.length;i++) {
			if(maxk < kion[i]) {
				maxk = kion[i];
			}
		}
		return maxk;
	}

	public static double min() {//最低気温を求める
		double mink = kion[0];//配列の０番目を初期値にする

		for(int i = 1;i < kion.length;i++) {
			if(mink > kion[i]) {
				mink = kion[i];
			}
		}
		return mink;
	}
}
