class ct 
{
	public static void main(String[] args) 
	{
		int num=19393;
		int count=0;
		while (num!=0)
		{
			int last= num%10;
			count++;
			num/=10;
		}
		System.out.println(count);
	}
}
