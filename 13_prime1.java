import java.util.Scanner;
class prime
{
	public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter num : ");
			int num= sc.nextInt();
			int den= 2;
			
			while(den<num)
			{
				if (num%den==0)
				{
					break;
				}
				den++;
			}
			if (num==den)
				{
					System.out.println("It is prime ");
				}
			else
				{
					System.out.println("Not a prime ");
				}
		}
}