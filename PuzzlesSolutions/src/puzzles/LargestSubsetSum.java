package puzzles;

import java.util.ArrayList;
import java.util.List;

public class LargestSubsetSum {
	static long[] maxSubsetSum(int[] k){
		List<Long> subsetSumInArrayList=new ArrayList<>();
		//Iterating over the number from 0.
		for(int i=0;i<k[i];i++)
		{
			long sum=0;
			for(int j=1;j<k[i];j++)
			{
			if(k[i]%j==0)
				sum+=j;
			else 
				continue;
			}
			//Numbers which ever are factors of the number, are sumed up and added to the arraylist "subsetSumINArrayList".
			subsetSumInArrayList.add(sum);
		}
		//Converting arraylist to array.
		long[] maxSubsetSum=new long[subsetSumInArrayList.size()];
		for(int l=0;l<subsetSumInArrayList.size();l++)
			maxSubsetSum[l]=subsetSumInArrayList.get(l);
		return maxSubsetSum;
	}
}
