
public class KionStat2 {
	static double kion[];//配列の作成


	public static void main(String[] args) {
		kion = new double []{12.8,12.0,11.4,11.2,10.6,10.6,10.3,10.6,
			13.1,16.9,20.1,22.2,21.9,22.5,23.9,24.1,
			22.9,21.9,20.1,18.9,17.6,17.0,16.4,15.7};

		for(int i = 0;i < kion.length;i++) {
			System.out.println(kion[i]);
		}
		System.out.println("平均" + ave(kion));
		System.out.println("最高気温" + max(kion));
		System.out.println("最低気温" + min(kion));

	}

	public static double ave(double array[]) {//平均気温を求める
		double sum = 0;

		for(int i=0;i < array.length;i++) {
			sum += array[i];
		}
		return sum/array.length;
	}

	public static double max(double array[]) {//最高気温を求める
		double maxk = array[0];//配列の０番目を初期値にする

		for(int i = 1;i < array.length;i++) {
			if(maxk < array[i]) {
				maxk = array[i];
			}
		}
		return maxk;
	}

	public static double min(double array[]) {//最低気温を求める
		double mink = array[0];//配列の０番目を初期値にする

		for(int i = 1;i < array.length;i++) {
			if(mink > array[i]) {
				mink = array[i];
			}
		}
		return mink;
	}
}
