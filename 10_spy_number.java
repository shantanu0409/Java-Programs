import java.util.Scanner;
class spy
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number");
	int num= sc.nextInt();
	int sum=0;
	int prod=1;
	while(num!=0)
		{
			int last= num%10;			
			sum+=last;
			prod*=last;
			
			num/=10;
		}
	if (sum==prod)
		{
			System.out.println("It is a Spy Number");
		}
	else
		{
			System.out.println("Not a Spy number");
		}
		
	}
	
}