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
	   // int result = a * a;
	    return(a*a);
	}
}