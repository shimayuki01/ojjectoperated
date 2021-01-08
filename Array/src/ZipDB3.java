import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// 郵便番号簿
public class ZipDB3 {
	ArrayList<YUBINstrage> db = new ArrayList<YUBINstrage>(); // 郵便番号データを配列で記録
	int index; // データの格納位置

	public ZipDB3(String file) {
		Scanner sfile = null;
		index = 0;
		try {
			sfile = new Scanner(new File(file)); // ファイルからの読み込み
			while (sfile.hasNext()) {
				String line = sfile.nextLine(); // 行単位の読み込み
				String sarr[] = line.split(","); // カンマでフィールドを分割
				db.add(new YUBINstrage(sarr));
			}
		} catch (FileNotFoundException e) { // eには例外のインスタンス
			System.out.println("Error:" + e.getMessage());
			System.exit(1); // ファイルがなければプログラムは終了
		} finally {
			if (sfile != null) { //scannerのインスタンスが代入されていることを確認
				sfile.close();
			}
		}
	}

	public void searchPrint(String zipcode) {
		for (YUBINstrage s : db) {
			// 番号が一致するものを検索
			if (zipcode.equals(s.Ynumber().substring(0, zipcode.length())))
				System.out.println(s);
		}
	}

	public int size() {
		return db.size();
	}

	public void printAll() {
		for (YUBINstrage s : db) {
			System.out.println(s);
		}
	}
}