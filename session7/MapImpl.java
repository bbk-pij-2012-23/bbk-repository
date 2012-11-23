public class MapImpl implements Map{
	//private int index = 0;
	MapItem<T> head = null;
	
/*	public int getIndex() {
		return index;
	}
*/	
	public void put(MapItem<T> mapitem){
		
		if (isEmpty(true)) {
			head = mapitem;
			mapitem.prev = null;
			mapitem.next = null;
			//index = 1;
			//mapitem.getMapItemKey() = index;
			
		}
		
		else{
			
		
		
		
}
