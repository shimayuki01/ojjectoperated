
import java.util.Scanner;

public class ZipSearch5 {
	public static void main(String args[]) {
		ZipDB zdb = new ZipDB("E:\\yuki0\\Documents\\2年後期\\オブしこ\\YUBIN.csv");
		Scanner sterm = new Scanner(System.in); // 端末からの入力

		while (sterm.hasNext()) {
			String line = sterm.nextLine(); // 行単位の読み込み
			zdb.searchPrint(line); // 郵便番号の検索と表示
		}
		sterm.close();
	}
}
