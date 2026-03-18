import java.util.Scanner;
class duckno 
{
    public static void main(String[] args) 
    {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
        int num = sc.nextInt();
       
		int last= 0;
        while (num != 0)
        {
           last = num % 10;
 
            if (last == 0)
            {
                System.out.println(last);
                break;
            }

            num /= 10;
        }

        if (last == 0)
        {
            System.out.println("Number Contains Zero");
        }
        else
        {
            System.out.println("Number Doesn't Contain Zero");
        }
    }
}