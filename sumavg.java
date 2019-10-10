import java.util.Scanner;
class sumavg
{
  public static void main(String[] args)
{
    int a,b,c,sum;
    float avg;
    Scanner s=new Scanner(System.in);
    
    System.out.println("enter 3 numbers");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();

   sum=a+b+c;
   avg=(float)sum/3;

   System.out.println("the sum is"+sum);
   System.out.println("avg is"+avg);
 }
}