public class Arraycopier {
	//int[] src;
	//int[] dst;

	public Arraycopier() {
	}
	/*
	public Arraycopier(int[] src1, int[] dst1) {
		this.src = src1;
		this.dst = dst1;
	}
	
	public void setSrc(int[] src2){
		this.src = src2;
	}
	
	public void setDst(int[] dst2){
		this.dst = dst2;
	}
	
	public int[] getSrc(){
		return  src;
	}
	
	public int[] getDst() {
		return dst;
	}
	*/
	
	public void copy(int[] src, int[] dst){
			
		int i = 0;
		if (src.length >= dst.length) { 
			while (i < dst.length) {
				dst[i] = src[i];
				i++;
			}
		}
		else {
			while (i < src.length) {
				dst[i] = src[i];
				i++;
			}
			while (i < dst.length) {
			dst[i] = 0;
			i++;
			}
		}
		//return dst;
	}
	
	public static void main(String[] args){
		Arraycopier myCopier = new Arraycopier();
	
		int[] myArray;
		myArray = new int[4];
		// int[] myArray = {123, 44, 55, 1}; resulted in error: unexpected token 123

		myArray[0] = 123;
		myArray[1] = 44;
		myArray[2] = 55;
		myArray[3] = 1;

		System.out.println ("my array contains the integers " + myArray[0] + ", " + myArray[1] + ", " + myArray[2] + " and " + myArray[3]);

		int[] nextArray;
		nextArray = new int[3];
		nextArray[0] = 34;
		nextArray[1] = 765;
		nextArray[2] = 2;
		
		System.out.println ("my next array contains the integers " + nextArray[0] + ", " + nextArray[1] + " and " + nextArray[2]);
		
		int[] anotherArray = new int[3];;
		//anotherArray = copy(myArray[], nextArray[]);
		myCopier.copy(myArray, anotherArray);
		System.out.println ("my next array now contains the integers " + anotherArray[0] + ", " + anotherArray[1] + " and " + anotherArray[2]);
		
		//System.out.println ("my next array now contains the integers " + nextArray[0] + ", " + nextArray[1] + " and " + nextArray[2]);
	}
}	
		
	
	
