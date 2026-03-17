class Even 
{
	public static void main(String[] args) 
	{
		int num=345226476;
		while(num!=0)
			{
				int last= num%10;
				if (last %2==0)
				{
					System.out.println(last);
				}
				num/=10;
			}
	}
}
