package Tutorials;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set hash_Set=new HashSet();
		hash_Set.add("one");
		hash_Set.add("second");
		hash_Set.add("3rd");
		hash_Set.add(new Integer(4));
		hash_Set.add(new Float(5.0F));
		hash_Set.add("second");
		hash_Set.add("new Integer(4)");
		System.out.println(hash_Set);
	}

}
