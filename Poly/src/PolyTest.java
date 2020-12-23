public class PolyTest {
	public static void main(String args[]) {
		int i;

		System.out.println("--- 個別クラス");

		ShapeRect0 rect0 = new ShapeRect0();
		ShapeCircle0 circle0 = new ShapeCircle0();
		ShapeTri0 tri0 = new ShapeTri0();

		System.out.println(rect0.getArea());
		System.out.println(circle0.getArea());
		System.out.println(tri0.getArea());

		System.out.println("--- ただの継承による体系化");

		ShapeRect1 rect1 = new ShapeRect1();
		ShapeCircle1 circle1 = new ShapeCircle1();
		ShapeTri1 tri1 = new ShapeTri1();

		System.out.println(rect1.getArea());
		System.out.println(circle1.getArea());
		System.out.println(tri1.getArea());

		System.out.println("--- 多態性が利用可能だが利用していない");

		ShapeRect2 rect2 = new ShapeRect2();
		ShapeCircle2 circle2 = new ShapeCircle2();
		ShapeTri2 tri2 = new ShapeTri2();

		System.out.println(rect2.getArea());
		System.out.println(circle2.getArea());
		System.out.println(tri2.getArea());

		System.out.println("--- 多態性を利用した例");

		// クラスの個別定義では何もできない
		/*
				Shape0 shape0[] = new Shape1[3] ; // そもそもスーパークラスがない
				shape0[0] = new ShapeRect0() ;
				shape0[1] = new ShapeCircle0() ;
				shape0[2] = new ShapeTri1() ;
		
				for (i = 0; i < 3; i++) {
					System.out.println(shape0[i].getArea()) ; // これができない
				}
		*/
		
		// 一括の保存まではできるが
		Shape1 shape1[] = new Shape1[3]; // 一括管理
		shape1[0] = new ShapeRect1();
		shape1[1] = new ShapeCircle1();
		shape1[2] = new ShapeTri1();
		/* スーパークラスに該当するメソッドがないし、サブクラス間のメソッドの関係も不明
				for (i = 0; i < 3; i++) {
					System.out.println(shape1[i].getArea()) ; // これができない
				}
		*/
		
		// 多態性が利用できる
		Shape2 shape2[] = new Shape2[3]; // 一括管理
		shape2[0] = new ShapeRect2();
		shape2[1] = new ShapeCircle2();
		shape2[2] = new ShapeTri2();

		for (i = 0; i < 3; i++) {
			// スーパークラスの変数で管理されると
			// 個別のオブジェクトのクラスがわからないように思うが。。。
			// 各オブジェクトは、それぞれの（サブクラスとしての）働きをする
			System.out.println(shape2[i].getArea()); // 一括操作
		}
	}
}

//--------------------
// 個別にクラス定義
class ShapeRect0 {
	public ShapeRect0() { }

	public double getArea() {
		return 1.0;
	}
}

class ShapeCircle0 {
	public ShapeCircle0() { }

	public double getArea() {
		return 2.0;
	}
}

class ShapeTri0 {
	public ShapeTri0() { }

	public double getArea() {
		return 3.0;
	}
}

//--------------------
// 継承を使用したクラスの体系化
class Shape1 {
}

class ShapeRect1 extends Shape1 {
	public ShapeRect1() { }

	public double getArea() {
		return 1.0;
	} // 共通してるが関係は不明
}

class ShapeCircle1 extends Shape1 {
	public ShapeCircle1() { }

	public double getArea() {
		return 2.0;
	} // 共通してるが関係は不明
}

class ShapeTri1 extends Shape1 {
	public ShapeTri1() { }

	public double getArea() {
		return 3.0;
	} // 共通してるが関係は不明
}

//--------------------
// 多態性が利用できるように定義された体系化
class Shape2 {
	public double getArea() {
		return -1.0;
	} // 共通機能の定義
}

class ShapeRect2 extends Shape2 {
	public ShapeRect2() { }

	public double getArea() {
		return 1.0;
	} // 個別化
}

class ShapeCircle2 extends Shape2 {
	public ShapeCircle2() { }

	public double getArea() {
		return 2.0;
	} // 個別化
}

class ShapeTri2 extends Shape2 {
	public ShapeTri2() { }

	public double getArea() {
		return 3.0;
	} // 個別化
}
