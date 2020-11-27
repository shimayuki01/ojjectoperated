

public class ZipSearch4 {
	public static void main(String args[]) {
		ZipDB zdb = new ZipDB("E:\\yuki0\\Documents\\2年後期\\オブしこ\\YUBIN.csv");
		zdb.printAll(); // 読み込みデータの表示確認
		System.out.println("データ数：" + zdb.size());
	}
}
