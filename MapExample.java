package Tutorials;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("one","1st");
		map.put("second", "new Integer(2)");
		map.put("third", "III");
		map.put("third", "III");
		Set set1=map.keySet();
		Collection collection=map.values();
		Set set2=map.entrySet();
		System.out.println(set1+"\n"+collection+"\n"+set2);
	}

}
