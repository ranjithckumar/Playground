import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(square(n));
	} 
  public static int square(int a)
	{
    int sum=0;
	  for(int i=1;i<=a;i++)
      {
        sum=i+sum;
      }
    return sum;
	}
}