class array_small_large
{
public static void main(String args[])
{

int[] arr=new int[args.length];
try{

int i=0,j=args.length-1;
while(true)
{
if(i>j)
 break;
if(i==j)
System.out.print(args[j]);
else
System.out.print(args[i]+""+args[j]);
i++;
j--;
}
}
catch(Exception e)
{
System.out.println("ERROR");
}
}
}

