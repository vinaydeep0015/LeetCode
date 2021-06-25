package comparator;
import java.util.Comparator;
import java.util.Map.Entry;

public class ComparatorExample implements Comparator<Entry<Integer, Integer>> {

	@Override
	public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
		return e1.getValue().compareTo(e2.getValue());
	}
	
	
}


