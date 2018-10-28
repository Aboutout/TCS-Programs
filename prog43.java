class prog43
{
public static void main(String args[])
{
int[] arr=new int[args.length];
for(int i=0;i<args.length;i++)
{
arr[i]=Integer.parseInt(args[i]);
}

for(int i=0;i<args.length;i++)
{
boolean b=false;
int n=arr[i];
for(int j=0;j<args.length;j++)
{
if(arr[j]==i)
{
System.out.print(i);
b=true;
break;
}
}
if(b==false)
 System.out.print("-1");
}
}
}
