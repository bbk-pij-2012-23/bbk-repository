/*this adds ok but contains() isnt working - returns false after 1 check each*/

public class TreeNode {
	int num;
	TreeNode left = null;
	TreeNode right = null;
	
	public TreeNode(int num1){
		this.num = num1;
	}
	
	public TreeNode getLeft(){
		return left;
	}
	
	public TreeNode getRight(){
		return right;
	}
	
	public int getNum(){
		return num;
	}	

	public void setLeft(TreeNode left1){
		this.left = left1;
	}

	public void setRight(TreeNode right1){
		this.right = right1;
	}
	
	public void addNode(int newNum){
		//but this num is newnum! I'm going to sleep.
		if (newNum < this.num){
			if (this.left == null){
				TreeNode left = new TreeNode(newNum);
				
				System.out.println("new left: " + newNum);
			}
			else{
				left.addNode(newNum);
			}
		}
		else{
			if (this.right == null){
				TreeNode right = new TreeNode(newNum);
				
				System.out.println("	new right: " + newNum);
			}
			else {
				right.addNode(newNum);
			}
		}
		
	}
	
//	public void removeNode(int number){
	
//	}
	

	
	public boolean contains(int n){ //this doesn't work
		int i = 0;
		System.out.println("this num is " + this.num);
		if (n == this.num) {
			i++;
			System.out.println("after " + i + " checks I found " + 
			this.num);
			return true;
		}
		else if (n > this.num){
			i++;
			if (right == null) {
				i++;
				System.out.println("after " + i + " checks I found " + 
					"R = null");
				if (left == null) {
					i++;
					System.out.println("after " + i + " checks I found " + 
					"L also = null. End of search.");
					return false;
				}
				else{
					i++;
					return left.contains(n);
				}
			}	
			else{
				i++;
				//System.out.println("R = " + right.num);
				return right.contains(n);
			}
		}
		else {
			if (left == null) {
				i++;
				System.out.println("after " + i + "checks I found " + 
					"L = null");
				if(right == null) { 
					System.out.println("after " + i + "checks I found " + 
					"R also = null. End of search.");
					return false; 
				}
				else {
					i++;
					//System.out.println("L = null");
					return right.contains(n);
				}	
			}
			else{
				i++;
				//System.out.println("L = " + left.num);
				return left.contains(n);
			}
		}
	}
	
			

	/*public void launch(){
		Integer[] src = new Integer[5];
		src[0] = 45;
		src[1] = 67;
		src[2] = 34;
		src[3] = 82;
		src[4] = 99;
		int i = 0;
		while(i < src.length) {
			TreeNode = new TreeNode(src[i]);
			addNode(src[i]);
			i++;
		}
		
				
	}	
	*/	
	public static void main(String[] args){
		Integer[] src = new Integer[5];
		src[0] = 45;
		src[1] = 67;
		src[2] = 34;
		src[3] = 82;
		src[4] = 99;
		int i = 0;
		while(i < src.length) {
			TreeNode node = new TreeNode(src[i]);
			node.addNode(src[i]);
			i++;
		}
	}	
}
