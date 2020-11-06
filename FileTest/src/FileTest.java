import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File f;
		f = new File(args[0]);

		if (!f.exists()) {//ファイルが存在するかディレクトリであったとしてもその中に存在するか）
			System.out.println("No file or directory");
			System.exit(1);
		}
		if (f.isDirectory()) {//それがディレクトリであるか
			System.out.println(args[0] + " is a directory");
			//中に存在するファイルを列挙する
			String[] files = f.list();
			for (int i = 0; i < files.length; i++)
				System.out.println(files[i]);
		} else {
			//ファイルサイスを確認
			System.out.println("File size: " + f.length());
			if (f.canRead()) {//読み込み可能か
				System.out.println("Read OK");
			} else {
				System.out.println("Read NO");
			}

		}

	}
}