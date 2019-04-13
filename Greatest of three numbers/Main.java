import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int gt=a;
      if((b>gt)&&(b>c))
      {
        System.out.println(b);
      }
      else if((c>gt)&&(c>b))
      {
        System.out.println(c);
      }
      else
      {
        System.out.println(gt);
      }
      
                           
        
    }
}