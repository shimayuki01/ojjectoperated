public class InheritanceTest5 {
	public static void main(String[] args) {
		SimpleStack stk1 = new SimpleStack();
		DumpStack stk2 = new DumpStack();
		IncStack stk3 = new IncStack();
		IncStack stk4 = new IncStack();
		stk1.push(1);
		stk2.push(10);
		stk3.push(100);
		stk4.push(1000);
		System.out.println(stk1.pop());
		System.out.println(stk2.pop());
		System.out.println(stk3.pop());
		System.out.println(stk4.pop());
	}
}