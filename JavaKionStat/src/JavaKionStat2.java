
public class JavaKionStat2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KionData.print();
		System.out.println("----------");
		//KionDataで計算した値を出力する
		System.out.println("平均" + KionData.calcAve());
		System.out.println("最高気温" + KionData.clacMax());
		System.out.println("最低気温" + KionData.calkMin());

	}

}
//気温データの保持・計算をする
class KionData{
	static double kion[] =
		{12.8,12.0,11.4,11.2,10.6,10.6,10.3,10.6,
			13.1,16.9,20.1,22.2,21.9,22.5,23.9,24.1,
			22.9,21.9,20.1,18.9,17.6,17.0,16.4,15.7};

	//一時間ごとの気温をすべて出力
	public static void print()
	{
		for(int i = 0;i < kion.length;i++) {
			System.out.println(kion[i]);
		}
	}
	//平均気温を求める
	public static double calcAve(){
		double sum = 0;

		for(int i=0;i < kion.length;i++) {
			sum += kion[i];
		}
		return sum/kion.length;
	}
	//最高気温を求める
	public static double clacMax() {
		double max = kion[0];//配列の０番目を初期値にする

		for(int i = 1;i < kion.length;i++) {
			if(max < kion[i]) {
				max = kion[i];
			}
		}
		return max;
	}
	//最低気温を求める
	public static double calkMin() {
		double min = kion[0];//配列の０番目を初期値にする

		for(int i = 1;i < kion.length;i++) {
			if(min > kion[i]) {
				min = kion[i];
			}
		}
		return min;
	}
}
