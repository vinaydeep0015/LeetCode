package SampleProgs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Question statement: Write a function to return a copy of a list of strings
 * with duplicates removed. Preserve order in the original list as much as
 * possible (keep first occurrence).
 * 
 * If the candidate implements this quickly, then ask to reimplement to keep nth
 * occurrence (where n is specified as a parameter). Example ["foo", "bar",
 * "baz", "foo", "bar"] -> ["foo", "bar", "baz"]
 * 
 * Tips for interviewer (Only share this with the candidate as needed) If the
 * candidate struggles to come up with a strategy for the simple case, you can
 * hint that using a Set may be helpful. If they're not familiar with a Set,
 * explain that it's like a HashMap with only keys (no values).
 * 
 * If you get to the harder version of the question, make sure they think about
 * the important edge case where a string has fewer than n occurrences in the
 * input.
 * 
 * 
 * 
 * @author vinay
 *
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		
		List<String> listWithDuplicate = new ArrayList<String>();
		listWithDuplicate.add("foo");
		listWithDuplicate.add("bar");
		listWithDuplicate.add("baz");
		listWithDuplicate.add("foo");
		listWithDuplicate.add("bar");

		Set<String> set = new HashSet<String>(listWithDuplicate);
		System.out.println(set);
	}
}
