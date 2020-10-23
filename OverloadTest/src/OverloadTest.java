/**
 *
 */

/**
 * @author yuki0
 *
 */
public class OverloadTest {

	public static void main(String[] args) {
		System.out.println(Add.add(8, 7));
		System.out.println(Add.add(8.5, 7.6));
		System.out.println(Add.add(8.6, 7));
		System.out.println(Add.add(8, 7.4));

	}

}
class Add{
	public static int add(int x, int y) { //整数同士の和
		System.out.println("add(int x,int y)") ;
		return x + y ;
		}
		public static double add(double x, double y){ //実数同士の和
		System.out.println("add(double x,double y)") ;
		return x + y ;
		}
		public static double add(double x, int y) { //整数と実数の和
			System.out.println("add(double x,int y)") ;
			return x + y ;
		}
		public static double add(int x, double y) {
			System.out.println("add(int x,double y)") ;
			return x + y ;
		}


}