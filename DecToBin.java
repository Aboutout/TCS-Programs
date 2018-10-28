class DecToBin
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int[] arr=new int[64];
int index=0;
while(n>0)
{
arr[index]=n%2;
index++;
n/=2;
}
for(int i=index;i>=0;i--)
{
System.out.print(arr[i]);
}
}
}
