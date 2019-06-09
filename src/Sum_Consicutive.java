import java.util.Scanner;

public class Sum_Consicutive {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

	   
	    int start = 1; 
	    int end = (n + 1) / 2; 
	
	    while (start < end) 
	    { 
	        int sum = 0; 
	        for (int i = start; i <= end; i++) 
	        { 
	            sum = sum + i; 
	 
	            if (sum == n) 
	            { 	              
	                for (int j = start; j <= i; j++) 
	                      
	                    System.out.print(j + " "); 
	                    System.out.println(); 
	                break; 
	            } 
	  
	          
	            if (sum > n) 
	                break; 
	        } 
	        sum = 0; 
	        start++; 
	    } 
	} 
		


}
