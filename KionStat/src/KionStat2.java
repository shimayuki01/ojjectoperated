
public class KionStat2 {
	static double kion[];


	public static void main(String[] args) {
		kion = new double []{12.8,12.0,11.4,11.2,10.6,10.6,10.3,10.6,
			13.1,16.9,20.1,22.2,21.9,22.5,23.9,24.1,
			22.9,21.9,20.1,18.9,17.6,17.0,16.4,15.7};

		System.out.println("平均" + ave(kion));
		System.out.println("最高気温" + max(kion));
		System.out.println("最低気温" + min(kion));

	}
	public static double ave(double array[]) {
		double sum = 0;

		for(int i=0;i < array.length;i++) {
			sum += array[i];
		}
		return sum/array.length;
	}

	public static double max(double array[]) {
		double maxk = array[0];

		for(int i = 1;i < array.length;i++) {
			if(maxk < array[i]) {
				maxk = array[i];
			}
		}
		return maxk;
	}

	public static double min(double array[]) {
		double mink = array[0];

		for(int i = 1;i < array.length;i++) {
			if(mink < array[i]) {
				mink = array[i];
			}
		}
		return mink;
	}
}
