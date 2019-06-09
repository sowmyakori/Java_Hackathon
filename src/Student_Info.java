import java.util.Iterator;
import java.util.TreeMap;

public class Student_Info
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer> studentMap = new TreeMap<String, Integer>();
		studentMap.put("Aarna", 201701);
		studentMap.put("Harsha", 201702);
		studentMap.put("Aanya", 201876);
		studentMap.put("Dina", 201988);
		studentMap.put("Mona", 201765);
		
		Iterator<String> itr = studentMap.keySet().iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key+","+studentMap.get(key));
		}
		
	}
	
	

}
