package puzzles;

public class ConsecutiveSum {
	
	static int consecutive(float sum){
		float numberToBeAdded=2.0f;
		int noOfWays=0;
		float i=1;
		while(numberToBeAdded>1){
			//every number will have sum of consecutive numbers as ([i+(i+1)+(i+2)+....].Based on this concept, the below formula will give the output.
			numberToBeAdded=(sum-((i+1)*i/2))/(i+1);
			if(numberToBeAdded-Math.floor(numberToBeAdded)==0){
				noOfWays++;
			}
			i++;
		}
		return noOfWays;
	}
}
