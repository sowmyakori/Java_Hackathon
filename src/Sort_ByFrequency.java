import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Sort_ByFrequency {

	public static void main(String[] args) {

		int arr[] = {2,5,3,8,7,2,5,2,3};
		
		LinkedHashMap<Integer, Integer> lhMap=new LinkedHashMap<Integer, Integer>();
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(!lhMap.containsKey(arr[i]))
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				lhMap.put(arr[i], count);
			}
		}
		
		Iterator<Integer> itr = lhMap.keySet().iterator();
		while(itr.hasNext())
		{
			int key = itr.next();
			
			for(int i=0;i<lhMap.get(key);i++)
			{
				System.out.print(key+",");
			}
		}
			
		
		
	}

}
