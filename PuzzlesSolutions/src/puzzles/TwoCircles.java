package puzzles;

import java.util.ArrayList;
import java.util.List;
//This sum could be modularized by creating a separate method for detecting circle type and for computations. Due to lack of time, I have coded it like this.
public class TwoCircles {
	static String[] circle(String[] info){
		List<String> circleTypeArrayList=new ArrayList<>();
		for(int i=0;i<info.length;i++){
			String[] splitTheArray=info[i].split(" ");
			for(int j=0;j<splitTheArray.length;j++){
				int[] testCase={};
				testCase=new int[splitTheArray.length];
				testCase[j]=Integer.parseInt(splitTheArray[j]);
				int distanceBetweenCentres=0;
				int firstCircleRadius=0;
				int secondCircleRadius=0;
				int sumOfRadius=0;
				firstCircleRadius=testCase[2];
				secondCircleRadius=testCase[5];
				sumOfRadius=firstCircleRadius+secondCircleRadius;
				int smallestRadius;
				int largestRadius;
				if(firstCircleRadius<secondCircleRadius){
					smallestRadius=firstCircleRadius;
					largestRadius=secondCircleRadius;
				}
				else{
					smallestRadius=secondCircleRadius;
					largestRadius=firstCircleRadius;
				}
				if(testCase[0]==0){
					distanceBetweenCentres=testCase[4]-testCase[1];
					if(distanceBetweenCentres==sumOfRadius)
						circleTypeArrayList.add("Touching");
					else if(distanceBetweenCentres<sumOfRadius)
						circleTypeArrayList.add("Intersecting");
					else if(distanceBetweenCentres>sumOfRadius)
						circleTypeArrayList.add("Disjoint-Outside");
					else if(distanceBetweenCentres==0)
						circleTypeArrayList.add("Concentric");
					else if((distanceBetweenCentres+smallestRadius)<largestRadius)
						circleTypeArrayList.add("Disjoint-Inside");
				}
				else if(testCase[1]==0){
					distanceBetweenCentres=testCase[3]-testCase[0];
					if(distanceBetweenCentres==sumOfRadius)
						circleTypeArrayList.add("Touching");
					else if(distanceBetweenCentres<sumOfRadius)
						circleTypeArrayList.add("Intersecting");
					else if(distanceBetweenCentres>sumOfRadius)
						circleTypeArrayList.add("Disjoint-Outside");
					else if(distanceBetweenCentres==0)
						circleTypeArrayList.add("Concentric");
					else if((distanceBetweenCentres+smallestRadius)<largestRadius)
						circleTypeArrayList.add("Disjoint-Inside");
				}
					
			}
		}
		String[] circleType=new String[circleTypeArrayList.size()];
		for(int k=0;k<circleTypeArrayList.size();k++)
			circleType[k]=circleTypeArrayList.get(k);
		return circleType;
	
	}
}
