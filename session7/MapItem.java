public class MapItem<T> {
	T itemValue;
	int itemKey;
	MapItem next;
	MapItem prev;

/** when you get better at this, allow itemKey to be generic (this means you will 
*have to add a ranking procedure to MapImpl
*/
	public MapItem(T itemValue1, int itemKey1){
		this.itemValue = itemValue1;
		this.itemKey = itemKey1;
	}

	public MapItem(){
	}
	
	public int getKey(){
		return itemKey;
	}
	
}	
