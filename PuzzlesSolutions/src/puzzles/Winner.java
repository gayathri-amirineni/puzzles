package puzzles;

public class Winner {
	int i,j;
	String s, winner;
	public String evenorodd(String s,int[] andrea, int[] marea){
		if(s.toLowerCase().equals("even"))
			j=0;
		else if(s.toLowerCase().equals("odd"))
			j=1;
		int ap=0;
		int mp=0;
		for(i=j;i<andrea.length;i+=2){
			ap=ap+andrea[i]-marea[i];
			mp=mp+marea[i]-andrea[i];
		}
		if(ap>mp)
			 winner="Andrea";
		else if(mp>ap)
			winner="Marea";
			
	return winner;
}}
