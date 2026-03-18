class count 
{
	public static void main(String[] args) 
	{
		int evencount=0;
		int oddcount=0;
		int num=345255;
		while (num!=0)
		{
			int last= num%10;
			if(last%2==0)
				{
					evencount++;
				}
			else
				{
					oddcount++;
				}
			num/=10;
		}
		System.out.println("Even count:" + evencount);
		System.out.println("Odd Count: " + oddcount);
		
	}
}
