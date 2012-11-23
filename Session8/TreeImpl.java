public class TreeImpl implements Tree {
	
	
/** a tree needs a root, in lists I put the root as a field
* it also need element objects so need a class for TreeNodes
*/
	public TreeImpl(){
	}
	
	
/** add() creates a root with the mid value 
* add() node added is corrected pointed at by parent node
* add() puts > ints on the right and < ints on left
*/
	
	public void addNode(int newNum){
		
		if (newNum < this.num){
			if (this.left == null){
				TreeNode left = new TreeNode(newNum);
			}
			else{
				left.addNode(newNum);
			}
		}
		else{
			if (this.right == null){
				TreeNode right = new TreeNode(newNum);
			}
			else {
				right.addNode(newNum);
			}
		}
		
	}
	
//	public void removeNode(int number){
	
//	}
	

	
	public boolean contains(int n){
		if (n == this.num) {
			System.out.println(this.num);
			return true;
		}
		else if (n > this.num){
			if (right == null) {
				System.out.println("R = null");
				return false;
			}
			else{
				System.out.println("R = " + right.num);
				return right.contains(n);
			}
		}
		else {
			if (left == null) {
				System.out.println("L = null");
				return false;
			}
			else{
				System.out.println("L = " + left.num);
				return left.contains(n);
			}
		}
	}
	
			

	public void launch(){
		
		Integer[] src = new Integer[5];
		src[0] = 45;
		src[1] = 67;
		src[2] = 34;
		src[3] = 82;
		src[4] = 99;
		int i = 0;
		while(i < src.length) {
			addNode(src[i]);
			i++;
		}
		contains(34);		
	}
/*	public static void main(String[] args){
		Tree node = new TreeImpl();
		node.launch();
	}	
*/
}
