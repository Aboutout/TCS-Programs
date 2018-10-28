import java.util.*;
class Half
{
public static boolean check(int p)
{
int count=0;
for(int i=2;i<p;i++)
{
if(p%i==0)
count++;
}
if(count==0)
return true;
else
return false;
}
public static int sum_number(int a,int b)
{
int sum=0;
for(int i=a;i<=b;i++)
{
if(i==1)
 continue;
boolean bol=Half.check(i);
if(bol)
  sum+=i;
}
return sum;
}
public static void main(String args[])
{
try{
Scanner sc=new Scanner(System.in);
int  t=sc.nextInt();
int[][] testcase=new int[t][2];
for(int i=0;i<t;i++)
{
for(int j=0;j<2;j++)
{
testcase[i][j]=sc.nextInt();
}
}
for(int i=0;i<t;i++)
{
int temp1=testcase[i][0];
int temp2=testcase[i][1];
System.out.println(Half.sum_number(temp1,temp2));
}
}
catch(Exception e)
{
System.out.println("ERROR");
}
}
}
