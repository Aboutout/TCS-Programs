import java.util.*;
class prime_fib
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int arr[]=new int[n];
int index=0;
arr[1]=0;
arr[3]=1;
for(int i=2;i<=n;i++)
{
int count=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
 count++;
}
if(count==0)
{
arr[index]=i;
index+=2;
}
if(index >=n)
 break;
}

for(int i=5;i<=n;i=i+2)
{
if(i>=n)
break;
arr[i]=arr[i-4]+arr[i-2];
}
for(int a: arr)
  System.out.print(a);

}
}

