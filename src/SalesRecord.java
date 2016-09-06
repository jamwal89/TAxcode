
import java.util.Scanner;

public class SalesRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		String CustomerName;
		int  CustNumber;
		double Taxcode,SalesAmount,TotalAmount = 0;;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter customer name \n");
		CustomerName = sc.next();
		
		System.out.println("Enter the Tax code in percent  \n");
		Taxcode =sc.nextDouble();
		
		System.out.println("Enter Customer Number \n");
		CustNumber = sc.nextInt();
		
		System.out.println("Enter the Sales AMount \n");
		SalesAmount = sc.nextDouble();
		
		System.out.println(CustomerName);
		System.out.println(CustNumber);
		
		
		if (Taxcode == 6)
		{
		
				TotalAmount = SalesAmount * Taxcode/100 + SalesAmount;
				
				System.out.println("The TAx code is NRM \n");
				System.out.println("Total Amount due is " + TotalAmount);
		}
		else if (Taxcode == 0)	{	
					TotalAmount = SalesAmount * Taxcode + SalesAmount;
				
					System.out.println("The TAx code is NPF \n");
					System.out.println("Total Amount due is " + TotalAmount);
				
				
		}
		
		else if (Taxcode == 4.5) {
			TotalAmount = SalesAmount * Taxcode + SalesAmount;
		
			System.out.println("The TAx code is BIZ \n");
			System.out.println("Total Amount due is " + TotalAmount);
			
		}	
		
	}
	

	}
