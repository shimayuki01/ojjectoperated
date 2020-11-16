import java.io.File; // Fileクラスを利用する
import java.io.FileNotFoundException; // FileNotFoundExceptionクラスを利用する
import java.util.Scanner; // Scannerクラスを利用する

public class ZipSearch2 {
	public static void main(String args[]) {
		Scanner sfile = null;
		Scanner sterm = new Scanner(System.in); // 端末からの入力
		String zip = sterm.next(); // 検索番号の取得
		try {
			sfile = new Scanner(new File("E:\\yuki0\\Documents\\2年後期\\オブしこ\\YUBIN.csv")); // ファイルからの読み込み
			while (sfile.hasNext()) {
				String line = sfile.nextLine(); // 行単位の読み込み
				String sarr[] = line.split(","); // カンマでフィールドを分割
				if (zip.equals(sarr[1])) // 郵便番号の比較
					System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: ファイルが見つかりません");
		} finally {
			if (sfile != null) { // scannerのインスタンスが代入されていることを確認
				sfile.close();
			}
		}
		sterm.close();
	}
}