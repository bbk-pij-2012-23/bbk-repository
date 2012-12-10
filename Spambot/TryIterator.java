import java.util.*;

public class TryIterator {

	public void launch(){
		//
	
	
	public static void main(String[] args){
		
		Set<String> urls = new HashSet<String>();
		urls.add("www.bbk.ac.uk");
		urls.add("www.dcs.bbk.ac.uk");
		urls.add("moodle.bbk.ac.uk");
		System.out.println(urls.size());
		
		Iterator it = urls.iterator();
		while (it.hasNext()){
			Object element = it.next();
			System.out.println(element + " ");
		}
	}
}	