public class Recursion {

	public static void printNumbers(int n) { 
		if (n <= 0) {
			return; 
		}
		System.out.println(n); 
		printNumbers(n-2); 
		printNumbers(n-3); 
		System.out.println(n);
	}
	
}

/* pass 6, is not = or less than 0 so print 6
*  but then reach printNumbers(n-2) so pass 4,
*  is not = or less than 0 so print 4
*  but then reach printNumbers(n-2) again so pass 2, 
*  is not = or less than 0 so print 2
*  then pass 0, it is = 0 so return.
*  THIS IS WHERE I FUCKED UP. I thought that would exit the overall 
*  method but it just ends the n-2 recursion. It reaches print(n) 
*  and prints 2 again. I need to draw it
*  
*
