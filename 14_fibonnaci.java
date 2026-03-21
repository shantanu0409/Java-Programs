import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			int n1=0;
			int n2=1;
			int ans;
			
			for(int i=0; i<n; i++)
				{
					ans= n1+n2;
					System.out.println(n1);
					
					n1=n2;
					n2=ans;
				}
			
		}
}