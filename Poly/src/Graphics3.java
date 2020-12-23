import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics3 {
	public static void main(String argv[]) {
		Frame f = new DrawFrame("Graphics2");

	}
}

class DrawFrame extends Frame {
	GDraw[][] draw1 = new GDraw[3][5];
	GDraw[] draw2 = new GDraw[3];

	public DrawFrame(String title) {
		super(title); // ウィンドウのタイトルを設定
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0); //終了イベント
			}
		});
		setSize(500, 500); // ウィンドウのサイズを設定
		setVisible(true); // ウィンドウを可視化（表示）

		int x;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				//奇数と偶数の時で配置を変える
				if (i != 1)
					x = j * 50 + 50;
				else
					x = j * 50 + 75;

				draw1[i][j] = new Gster(x, i * 50 + 50, Color.yellow);
			}
		}

		draw2[0] = new Gmoon(400, 100, Color.yellow);

		draw2[1] = new Gbuilding(150, 350, Color.gray);
		draw2[2] = new Gbuilding(350, 300, Color.red);

		System.out.println(draw1.length);
		System.out.print(draw1[0].length);


	}

	public void paint(Graphics g) {
		Dimension size = getSize();
		g.setColor(Color.blue);
		g.fillRect(0, 0, size.width - 1, size.height - 1);

		for (int i = 0; i < draw1.length;i++)
			for (int j = 0; j < draw1[i].length; j++)
				draw1[i][j].draw(g);

		for (int i = 0; i < draw2.length; i++)
			draw2[i].draw(g);
	}
}

//座標と色の取得は共通しているのでスーパークラスを作成する
abstract class GDraw {
	int x0, y0;
	Color c;

	public GDraw(int x, int y, Color c) {
		this.x0 = x;
		this.y0 = y;
		this.c = c;
	}

	public void draw(Graphics g) {
		g.setColor(c);
	}
}

//星を描画するクラス
class Gster extends GDraw {

	public Gster(int x, int y, Color c) {
		super(x, y, c);
	}

	public void draw(Graphics g) {
		super.draw(g);
		g.drawLine(x0 - 8, y0 - 6, x0 + 8, y0 - 6);
		g.drawLine(x0 - 8, y0 - 6, x0 + 6, y0 + 8);
		g.drawLine(x0, y0 - 12, x0 + 6, y0 + 8);
		g.drawLine(x0, y0 - 12, x0 - 6, y0 + 8);
		g.drawLine(x0 + 8, y0 - 6, x0 - 6, y0 + 8);
	}
}

//月を描画するクラス
class Gmoon extends GDraw {

	public Gmoon(int x, int y, Color c) {
		super(x, y, c);
	}

	public void draw(Graphics g) {
		super.draw(g);
		g.fillOval(x0, y0, 50, 50);
	}

}

//ビルの窓を描画するクラス
class buildingWindw extends GDraw {

	public buildingWindw(int x, int y, Color c) {
		super(x, y, c);
	}

	public void draw(Graphics g) {
		super.draw(g);
		g.fillRect(x0, y0, 20, 20);
	}
}

//ビルを描画するクラス
class Gbuilding extends GDraw {

	public Gbuilding(int x, int y, Color c) {
		super(x, y, c);
	}

	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawLine(x0 - 50, y0 - 100, x0 + 50, y0 - 100);
		g.drawLine(x0 - 50, y0 - 100, x0 - 50, y0 + 100);
		g.drawLine(x0 + 50, y0 + 100, x0 + 50, y0 - 100);
		g.drawLine(x0 + 50, y0 + 100, x0 - 50, y0 + 100);

		super.draw(g);
		g.fillRect(x0 - 49, y0 - 99, 99, 199);

		//窓を描画する
		GDraw[][] wind = new buildingWindw[2][4];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				int x = 20 + 40 * i;
				int y = 20 + 40 * j;
				wind[i][j] = new buildingWindw(x0 - 50 + x, y0 - 100 + y, Color.yellow);
				wind[i][j].draw(g);
			}
		}

	}

}
