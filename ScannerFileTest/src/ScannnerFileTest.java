import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannnerFileTest {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File(args[0]));

			while (scanner.hasNext()) {
				String input = scanner.nextLine();//行ごとに区切る
				String con[] = input.split(",");//カンマごとに区切る

				for (int i = 0; i < con.length; i++) {
					System.out.println(con[i]);
				}

			}
			scanner.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: ファイル名が指定されていません");
		} catch (FileNotFoundException e) { // Scannerがスローする例外
			System.out.println("Error: ファイルが見つかりません" + args[0]);
		}
	}

}
