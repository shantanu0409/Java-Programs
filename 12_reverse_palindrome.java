import java.util.Scanner;
class palindrome
{
	public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Number");
			int num= sc.nextInt();
			
			int temp=num;
			int rev=0;
			
			while(num!=0)
				{
					int last = num%10;
					rev= rev*10+last;
					num/=10;				
					
				}
				System.out.println("Reverse = "+rev);
				
			if(rev==temp)
				{
					System.out.println("It is Palindrome");
				}
			else
				{
					System.out.println("Not a Palindrome");					
				}
		}
}