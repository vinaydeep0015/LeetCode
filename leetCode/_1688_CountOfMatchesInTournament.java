
public class _1688_CountOfMatchesInTournament {
	static int total;
    public static int numberOfMatches(int n) {
        if(n==1){
            return total;
        }
        else if(n%2 ==0){
            total += n/2;
            return numberOfMatches(n/2);
        }
        else{
            total += (n-1)/2;
           return numberOfMatches((n-1)/2+1);
        }
    }
    
    public static void main(String[] args) {
		
    	System.out.println(numberOfMatches(14));
	}
}