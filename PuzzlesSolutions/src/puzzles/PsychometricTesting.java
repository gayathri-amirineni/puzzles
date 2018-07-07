package puzzles;

import java.util.ArrayList;
import java.util.List;

public class PsychometricTesting {
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits){
		List<Integer> offersCountInArrayList=new ArrayList<>();
		//Iterating over the scores, upper and lower limits.
		for(int i=0;i<lowerLimits.length;i++)
		{
			int count=0;
			for(int j=0;j<scores.length;j++)
			{
				if(scores[j]>=lowerLimits[i] && scores[j]<=upperLimits[i])
				count++;
			}
			if(count>0)
				offersCountInArrayList.add(count);	
		}
		//Converting ArrayList to Array
		int[] offersCount=new int[offersCountInArrayList.size()];
		for(int k=0;k<offersCountInArrayList.size();k++){
		offersCount[k]=offersCountInArrayList.get(k);
		}
		return offersCount;
	}}
