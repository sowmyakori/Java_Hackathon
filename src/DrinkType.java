import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class DrinkType {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> drinkMap = new LinkedHashMap<String, Integer>();
		drinkMap.put("OrangeJuice", 3);
		drinkMap.put("Lemonade", 5);
		drinkMap.put("Latte", 7);
		drinkMap.put("GingerAle", 2);
		drinkMap.put("Cola", 1);
		
		System.out.println("Enter which type of drink you need");
		System.out.println(drinkMap.keySet().toString());
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		
		Iterator<String> itr = drinkMap.keySet().iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			if(type.equalsIgnoreCase(key))
			{
				int value =drinkMap.get(key);
			
				if(value>1)
				{
					System.out.println("Your drink is served");
					value--;	
					drinkMap.put(key, value);
					break;
				}
				else
				{
					System.out.println("Requested drink is not available");
					break;
				}
					
				
			}
		}
		System.out.println("After serving drink quantity");
		Iterator<String> itr2 = drinkMap.keySet().iterator();
		while(itr2.hasNext())
		{
			String key = itr2.next();
			System.out.println(key+","+drinkMap.get(key));
		}
		
	}

}
