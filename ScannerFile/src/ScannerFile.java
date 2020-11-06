import java.io.File; // Fileクラスを利用する
import java.io.FileNotFoundException; // FileNotFoundExceptionクラスを利用する
import java.util.Scanner; // Scannerクラスを利用する

public class ScannerFile {
	public static void main(String args[]) {
		try {
			// try節の中は本質的な処理のみが記述されている
			Scanner scanner = new Scanner(new File(args[0])); // ファイルから読み込み
			while (scanner.hasNext()) {
				String line = scanner.nextLine(); // 行単位の読み込み
				System.out.println("LINE: " + line);
			}
			scanner.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: ファイル名が指定されていません");
		} catch (FileNotFoundException e) { // Scannerがスローする例外
			System.out.println("Error: ファイルが見つかりません" + args[0]);
		}
 }
}