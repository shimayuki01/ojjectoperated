import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZipDB {

	YUBINstrage strage[];
	int index;

	public ZipDB(String file) {

		try (Scanner sfile = new Scanner(new File(file))) {
			index = 0;
			while (sfile.hasNext()) {
				sfile.nextLine(); // 行単位の読み込み
				index++;
			}
		}catch (FileNotFoundException e) { // eには例外のインスタンス
			System.out.println("Error: " + e.getMessage());
			System.exit(1); // ファイルがなければプログラムは終了
		}

		strage = new YUBINstrage[index]; // 実際のデータ数
		index = 0;

		try(Scanner sfile = new Scanner(new File(file))){
			while (sfile.hasNext()) {
				String line = sfile.nextLine(); // 行単位の読み込み
				String sarr[] = line.split(","); // カンマでフィールドを分割
				strage[index++] = new YUBINstrage(sarr);
			}
		} catch (FileNotFoundException e) { // eには例外のインスタンス
			System.out.println("Error: " + e.getMessage());
			System.exit(1); // ファイルがなければプログラムは終了
		}
	}

	public void searchPrint(String zipcode) {
		int i;
		if (zipcode.length() > 7) { //７文字以上の郵便番号は存在しないので検索外となる
			System.out.println("7文字以下の数字を入力してください");
			return;
		}
		for (i = 0; i < index; i++) {
			if (zipcode.equals(strage[i].Ynumber().substring(0, zipcode.length())))
				System.out.println(strage[i]);
		}
	}

	public int size() {
		return index;
	}

	public void printAll() {
		int i;
		for (i = 0; i < index; i++) {
			System.out.println(strage[i]);
		}
	}

}