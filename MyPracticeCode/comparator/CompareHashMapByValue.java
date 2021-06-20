package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompareHashMapByValue {
	
	public static void main(String[] args) {

		Map<Integer, Strength> map = new HashMap<Integer, Strength>();
		Strength s1 = new Strength(0, 30);
		Strength s2 = new Strength(1, 10);
		Strength s3 = new Strength(2, 50);
		Strength s4 = new Strength(3, 90);
		Strength s5 = new Strength(4, 20);
		Strength s6 = new Strength(5, 70);

		map.put(0, s1);
		map.put(1, s2);
		map.put(2, s3);
		map.put(3, s4);
		map.put(4, s5);
		map.put(5, s6);

		
		//Sort By Value using Object
		List<Strength> list = new ArrayList<>(map.values());
		Collections.sort(list);
		System.out.println(list);
		
		
		//Get index of an object
		int requiredVal = 70;
		Set<Entry<Integer,Strength>> entrySet = new HashSet<>(map.entrySet());
		
		for(Entry e: entrySet) {
			if(Strength.class.cast(e.getValue()).getVal()==requiredVal) {
				System.out.println(e.getValue());
			}
		}
	}

}
