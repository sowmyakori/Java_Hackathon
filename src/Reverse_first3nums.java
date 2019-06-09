import java.util.Arrays;
import java.util.Scanner;

public class Reverse_first3nums {

	public static void main(String[] args) {

		int arr[] = {3,2,4,7,0,3,1,5,8,6,9};
		System.out.println("enter the reverse limit");
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		int left,right;
		System.out.println("before swapping.."+Arrays.toString(arr));
		for(int i=0;i<arr.length;i+=k)
		{
			left=i;
			right=(i+k)-1;
			if(right<arr.length)
			swap(arr,left,right);//0,3
		}
		System.out.print("After Swapping.."+Arrays.toString(arr));
	

	}

	private static void swap(int[] arr,int left, int right) 
	{
		int mid=(left+right)/2;
		int k=0;
		for(int i=left;i<=mid;i++)
		{
			int j=right-k;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			k++;
			
		}
		
	}

}
