import java.util.*;
class sum_pair
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n= scan.nextInt();
int k= scan.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=scan.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(j!=i)
{
int sum=arr[i]+arr[j];
if(sum==k)
System.out.print(arr[i]+""+arr[j]);
arr[i]=k+1;
arr[j]=k+1;
}
}
}
}
}
