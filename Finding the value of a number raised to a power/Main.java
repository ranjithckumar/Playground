import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int pwr=sc.nextInt();
      int sqr=1;
      while(pwr>0)
      {
        sqr=sqr*base;
        pwr=pwr-1;
      }
      System.out.println(sqr);
    }
}