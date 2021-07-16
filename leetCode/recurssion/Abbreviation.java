package recurssion;

import java.util.HashMap;
import java.util.Map;

/**
 * Question statement: Write a function that takes a string as input and returns
 * an abbreviation of the form: <first letter> <number of omitted letters> <last
 * letter>.
 * 
 * If the candidate solves this quickly, add the following difficulty: Write
 * another function that takes an array of strings as input and return
 * true/false depending on whether this style of abbreviation is unique for this
 * array of words. E.g.: [“accessibility”, “automatically”, "airport"] should
 * return false because the first two words both abbreviate to a11y. Example
 * "internationalization" -> "i18n", "localization" -> "l10n" Tips for
 * interviewer (Only share this with the candidate as needed) Be sure that your
 * interviewee thinks about edge cases (0-, 1-, 2-, 3-letter inputs). The most
 * reasonable assumption is to not abbreviate those words.
 * 
 * 
 */
public class Abbreviation {
	public static void main(String[] args) {
		String str = "internationalization";
		String res = ""+str.charAt(0)+(str.length()-2)+str.charAt(str.length()-1);
		System.out.println(res);
		
		String arr[] ={"accessibility","automatically","airport"};
		Map<String,String> map = new HashMap<String,String>();
		
		Boolean flag = true;
		for(String s : arr) {
			String res1 = ""+s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1);
			if(map.containsValue(res1)) {
				flag = false;
				break;
			}else {
				map.put(s, res1);
			}
		}
		
		System.out.println(flag);
	}
}
