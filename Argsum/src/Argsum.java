/**
 *
 */

/**
 * @author yuki0
 *
 */
public class Argsum {
	public static void main(String args[]) {
		int i;
		double sum = 0;
	System.out.println("引数の個数： "+ args.length) ;
	for (i = 0; i < args.length; i++) {
		sum += Double.parseDouble(args[i]) ;
	}
	System.out.println(sum) ;
	}
}