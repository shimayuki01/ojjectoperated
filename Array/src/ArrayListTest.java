import java.util.ArrayList;
import java.util.Stack;
public class ArrayListTest {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> als = new ArrayList<String>();
		Stack<String> sstk = new Stack<String>() ;

				// データの登録
		for (int i = 0; i < 5; i++) {
		als.add("Data" + i);
		}
		System.out.println("---¥n" + als.size());
		for (String s :als) {
		System.out.println(s);
		}
		//--------------------
		// データの追加
		for (int i = 0; i < 3; i++) {
		als.add("Data" + i * 10000);
		}
		System.out.println("---¥n" + als.size());
		for (String s :als) {
		System.out.println(s);
		}

		sstk.push("Kyushu") ;
		sstk.push("Institute") ;
		sstk.push("of") ;
		sstk.push("Technology") ;
		System.out.println(sstk.empty()) ;
		for (String s: sstk) {
		System.out.println(s) ;
		}
		System.out.println(sstk.pop()) ;
		System.out.println(sstk.pop()) ;
		System.out.println(sstk.pop()) ;
		System.out.println(sstk.pop()) ;
		System.out.println(sstk.empty()) ;

	}

}
