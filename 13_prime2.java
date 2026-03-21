import java.util.Scanner;
class prime2
{
	public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Num:");
			int num= sc.nextInt();
			int den=2;
			
			while (den<=num/2)
			{
				if (num%den==0)
				{
					break;
				}
				den++;
			}
			
			if(den>num/2)
				{
					System.out.println("It is prime");
				}
			else
				{
					System.out.println("Not prime");
				}
		}
}