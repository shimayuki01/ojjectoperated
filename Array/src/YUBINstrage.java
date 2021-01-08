
public class YUBINstrage {
	String Yinfo[] = new String[5];

	public YUBINstrage(String a[]) {
		for (int i = 0; i < a.length; i++) {
			Yinfo[i] = a[i];
		}
	}

	public String Ynumber() {
		return Yinfo[1];
	}

	public String toString() {
		return Yinfo[1] + "," + Yinfo[2] + "," + Yinfo[3] + "," + Yinfo[4];
	}

}
