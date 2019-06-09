import java.util.Arrays;
import java.util.Scanner;

public class Merge_SortedArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[4];
		System.out.println("Enter 6 elements in sorted order");
		for(int i=0;i<6;i++)
			a[i]=sc.nextInt();
		System.out.println("enter 4 elements in sorted order");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		int j=b.length-1;
		for(int i=a.length-1;i>=b.length-1;i--)
		{
			if(j>=0)
			{
				a[i]=b[j];
				j--;
			}
		}
	
		int min;
		for(int i=0;i<a.length-1;i++)
		{
			min=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp =a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	
		System.out.println("Sorted Array\n" +Arrays.toString(a));
	}

}
