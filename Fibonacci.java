import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
try{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] fib=new int[a+1];
fib[1]=0;
fib[2]=1;
for(int i=3;i<=a;i++)
{
fib[i]=fib[i-2]+fib[i-1];
}
for(int b=1;b<=fib.length-1;b++)
System.out.print(fib[b]);
}
catch(Exception e)
{
System.out.println("Error");
}
}
}
