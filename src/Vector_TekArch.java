import java.util.Scanner;
import java.util.Vector;

public class Vector_TekArch {

	public static void main(String[] args) {

		System.out.println("Enter value of n");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		
		Vector<Character> vec = new Vector<Character>();
		vec.add('t');
		vec.add('e');
		vec.add('k');
		vec.add('a');
		vec.add('r');
		vec.add('c');
		vec.add('h');
		
		for(int i=0;i<=3;i++)
		{
			int temp=n;
			if(i==3)
			{
				while(temp>0)
				{
					vec.insertElementAt('z', i++);;
					temp--;
				}
			}
		}
		System.out.println("After Insertion");
		for(int i=0;i<vec.size();i++)
		{
			System.out.print(vec.get(i));
		}
		
		for(int i=0;i<=6;i++)
		{
			int temp=n;
			if(i==6)
			{
				while(temp>0)
				{
					vec.removeElementAt(i);
					temp--;
				}
			}
		}
		System.out.println("\nAfter deletion");
		for(int i=0;i<vec.size();i++)
		{
			System.out.print(vec.get(i));
		}
	}

}
