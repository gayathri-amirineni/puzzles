package puzzles;
import java.util.ArrayList;
import java.util.List;

public class BalancedOrNot {
	
	static int[] balancedOrNot(String[] expressions, int[] maxReplacements){
		List<Integer> result=new ArrayList<>();
		//Iterating over expressions array
		for(int i=0;i<expressions.length;i++)
		{
			int flag=0;
			int replacement=maxReplacements[i];
			//Converting each string element of "expressions" array into character array for iteration
			char[] expressionarray=expressions[i].toCharArray();
			//Iterating over each element of "expressions" array(Character Type)
			for(int j=0;j<expressionarray.length;j++)
			{
				if(expressionarray[j]=='<')
					flag++;
				else if(expressionarray[j]=='>')
					flag--;
				if(flag<0)
				{
					if(replacement>0)
					{
						replacement--;
						flag++;
					}
					else
						continue;
				}
			}
			if(flag>0)
				//Adding resultant output to result of type "arraylist".
				result.add(0);
			else
				result.add(1);
		}
		//Converting ArrayList to Array
		int[] balancedOrNotResult=new int[result.size()];
		for(int i=0;i<result.size();i++)
			balancedOrNotResult[i]=result.get(i);
		return balancedOrNotResult;	

	}	
}
