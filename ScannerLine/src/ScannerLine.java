import java.util.Scanner;

/**
 *
 */

/**
 * @author yuki0
 *
 */
public class ScannerLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String line = scanner.nextLine();

			System.out.println("line:" + line);

			String token[] = line.split(" ");//空白で切り分け
			for(int i = 0; i < token.length;i++) {
				System.out.println("tolem  " + token[i]);
			}
		}

		scanner.close();
	}

}