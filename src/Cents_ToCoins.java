import java.util.Scanner;

public class Cents_ToCoins {

	public static void main(String[] args) {
		
		System.out.println("Enter the amount in cents");
		Scanner sc = new Scanner(System.in);
		int cents=sc.nextInt();
		int dollar=0,quarter=0,dime=0,penny=0,rem=0,min_Coins=0;
		 
		dollar=cents/100;
		rem=cents%100;
		quarter=rem/25;
		rem = rem%25;
		dime=rem/10;
		rem=rem%10;
		penny=rem;
		
		min_Coins=dollar+quarter+dime+penny;
		System.out.println("Smallest possible number of cooins equaling the amount "+cents+"="+min_Coins+" Coins");
		

	}

}
