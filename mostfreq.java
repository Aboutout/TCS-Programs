import java.util.*;
class mostfreq
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);

int n=scan.nextInt();
int[] arr=new int[n];

for(int i=0;i<n;i++)
{
arr[i]=scan.nextInt();
}


int count=1,tempcount=0,popular=arr[0];
int temp;
for(int i=0;i<arr.length;i++)
{
temp=arr[i];
tempcount=0;
for(int j=i;j<arr.length;j++)
{
if(temp==arr[j])
tempcount++;
}
if(tempcount>count)
{
popular=temp;
count=tempcount;
}
}
System.out.println(popular);
}
}
