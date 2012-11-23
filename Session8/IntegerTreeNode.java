public class IntegerTreeNode {
	int value; 
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	public IntegerTreeNode(int value1){
		this.value = value1;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);	
			} else { right.add(newNumber);
		}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else { 
				left.add(newNumber);
			}
		}
	}
	
	public static void main(String[] args){
		IntegerTreeNode node = new IntegerTreeNode(50);
		node.add(49);
		node.add(20);
		node.add(120);
		node.add(32);
		System.out.println("tree created");
		System.out.println(node.contains(120));
		System.out.println(node.contains(49));
		System.out.println(node.contains(32));
		System.out.println(node.contains(29));
		
	}	

	
	public boolean contains(int n) { 
		if (n == this.value) {
			return true;
		} 
		else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n); 
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n); }
			}
		}
		
}
