import java.util.*;
class rotate
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int rev=scan.nextInt();
int n=scan.nextInt();
int index=0;
int[] arr=new int[n];
int[] out=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=scan.nextInt();
}

for(int i=rev;i<n;i++)
{
out[index]=arr[i];
index++;
}
for(int i=0;i<rev;i++)
{
out[index]=arr[i];
index++;
}
for(int a:out)
{
System.out.print(a);
}
}
}
