import java.util.Scanner;
class user 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input")
;		int num= sc.nextInt();
		System.out.println("Enter the Digit")
;		int digit= sc.nextInt();
		
		while (num!=0)
		{
			int last =num%10;
			if(last==digit)
				{
					break;
				}
				num/=10;
		}

			if(num==0)
				{
					System.out.println("Digit Not Found");
				}
			else
				{
					System.out.println("Digit found");
				}
		
		
	}
}
