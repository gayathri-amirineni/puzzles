package puzzles;

public class InTheFuture {
	
	static int minNum(int A, int K, int P){
		int daysRequired=0;
		int div=P/K;
		int mod=P%K;
		if(div>0 && mod>0)
			daysRequired=div+1;
		else if(div>0 && mod<0)
			daysRequired=div;
		else
			daysRequired=1;
			
		return daysRequired;
	}
}
