public class EggLayer extends Animal{

	public EggLayer(String eggLayerName){
		super(eggLayerName);
	}
	
	public void layEggs(){
		System.out.println("but just eggs at the moment");
	}	
	
	//reproduce();
	
	public static void main(String[] args) {
		System.out.println("what animal?");
		String str = System.console().readLine();
		EggLayer egglayer = new EggLayer(str);
		egglayer.reproduce();
		egglayer.layEggs();
	}
}