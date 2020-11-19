
public class YUBINstrage {
	String Yinfo[] = new String[5];

	public YUBINstrage(String a[]) {
		for(int i = 0;i < a.length;i++) {
			Yinfo[i] = a[i];
		}
	}

	public String Ynumber() {
		return Yinfo[1];
		}

	public void print() {
		for(int i=0;i < Yinfo.length;i++) {
			System.out.print(Yinfo[i]+" ");
		}
		System.out.println();
	}


}
