class argument{

public static void main(String args[])
{
 System.out.println("arguments passed during runtime");
 System.out.println(args[0]);
 System.out.println(args[1]);
 System.out.println(args[2]);
int first,second,sum;
first=Integer.parseInt(args[3]);
second=Integer.parseInt(args[4]);
sum=first+second;
System.out.println("The sum of two numbers is:"+sum);
}
}
