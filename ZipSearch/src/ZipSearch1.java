import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZipSearch1 {

	public static void main(String[] args) {
		Scanner sfile = null;
		int n = 1;
		try {
			sfile = new Scanner(new File("E:\\yuki0\\Documents\\2年後期\\オブしこ\\YUBIN.csv")); //ファイルからの読み込み
			while (sfile.hasNext()) {
				String line = sfile.nextLine(); // 行単位の読み込み
				System.out.println(n++ + ": " + line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: ファイルが見つかりません");
		} finally {
			if (sfile != null) { // scannerのインスタンスが代入されていることを確認
				sfile.close();
			}
		}

	}

}
