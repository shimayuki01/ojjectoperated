
public class StringLenge {

	public static void main(String[] args) {
		int i;
		int[] intarray = new int[10];
		for(i = 0;i < intarray.length; i++) {
			intarray[i] = i + 5;
		}
		for(i = 0; i < intarray.length; i++) {
			System.out.println(intarray[i]);
		}
	}

}
