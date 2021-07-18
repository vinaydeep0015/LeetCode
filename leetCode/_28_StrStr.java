
public class _28_StrStr {
	public int strStr(String haystack, String needle) {
        int res = -1;
        
        if(needle==null){
            return 0;
        }
        
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        
        return res;
    }
}
