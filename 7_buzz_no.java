import java.util.Scanner;
class buzz 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
			
			if (num % 10==7 || num%7==0)
			{
				System.out.println(num);
				System.out.println("It is a Buzz number");
				
			}
			else
			{
				System.out.println("Not a Buzz number");
			}
		
	}
}
