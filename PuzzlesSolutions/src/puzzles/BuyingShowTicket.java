package puzzles;

public class BuyingShowTicket {
	static long waitingTime(int[] tickets,int p){
		long waitingTime=0;
		int linelength=tickets.length;
		//based on the position given, waiting Time can be calculated using the following formula.
		waitingTime=(tickets[p]-1)*linelength+p+1;
		//Iterating over the tickets array
		for(int i=0;i<linelength;i++){
			if(i<p && tickets[i]<tickets[p])
				waitingTime=waitingTime-(tickets[p]-tickets[i]);
			else if(i>p && tickets[i]<tickets[p])
				waitingTime=waitingTime-(tickets[p]-tickets[i]-1);
		}
		return waitingTime;
	}
}
