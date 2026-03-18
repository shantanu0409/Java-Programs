import java.util.Scanner;
class sum
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int num= sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int last= num%10;
			sum+=last;
			num/=10;
		}
		 System.out.println("Sum of digits = " + sum);
	}
	
}