import java.util.*;

public class TestQ {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		String str = "first"
		while (!str.equals("-1")) {
			System.console().readLine();
			q.add(Integer.parseInt(str));
		}
		System.out.println(q);
	}
}	
	
	