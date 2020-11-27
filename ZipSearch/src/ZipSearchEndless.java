import java.io.File; // Fileクラスを利用する
import java.io.FileNotFoundException; // FileNotFoundExceptionクラスを利用する
import java.util.Scanner; // Scannerクラスを利用する

public class ZipSearchEndless {
	public static void main(String args[]) {
		Scanner sfile = null;
		Scanner sterm = new Scanner(System.in); // 端末からの入力

		try {
			sfile = new Scanner(new File("E:\\yuki0\\Documents\\2年後期\\オブしこ\\YUBIN.csv")); // ファイルからの読み込み
			YUBINstrage[] ystrage = new YUBINstrage[150000];
			int index = 0;
			while (sfile.hasNext()) {
				String line = sfile.nextLine(); // 行単位の読み込み
				String sarr[] = line.split(","); // カンマでフィールドを分割
				ystrage[index++] = new YUBINstrage(sarr);
			}
			while (sterm.hasNext()) {
				String zip = sterm.next(); // 検索番号の取得
				int a = 0;
				if (zip.length() > 7) { //７文字以上の郵便番号は存在しないので検索外となる
					System.out.println("7文字以下の数字を入力してください");
					continue;
				}
				for (int i = 0; i < index; i++) {
					if (zip.equals(ystrage[i].Ynumber().substring(0, zip.length()))) { // 郵便番号の比較
						System.out.println(ystrage);
						a = 1; //発見できたらa=1にして発見状態とする
					}
				}
				//a=0だったら見つかっていない
				if (a == 0) {
					System.out.println("見つかりませんでした");
				}
			}
			sterm.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: ファイルが見つかりません" + e.getMessage());
		} finally {
			if (sfile != null) { // scannerのインスタンスが代入されていることを確認
				sfile.close();
			}
		}
	}
}
