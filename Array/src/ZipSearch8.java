import java.util.Scanner;

public class ZipSearch8 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ZipDB3 zdb = new ZipDB3("E:\\yuki0\\Documents\\2年後期\\オブしこ\\YUBIN.csv");
		System.out.println("データ数：" + zdb.size());

		try(Scanner sterm = new Scanner(System.in)){
			while(sterm.hasNext()) {
				String line = sterm.nextLine();
				zdb.searchPrint(line);
			}
		}
	}

}
