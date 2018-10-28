class pascal
{
public static void main(String args[])
{

try{
if(args.length>2)
  throw new Exception();
int r=Integer.parseInt(args[0]);
int i=0,k=0,j=0;
for(i=0;i<r;i++)
{
for(k=r; k>i; k--)
{
System.out.print(" ");
}
int number = 1;
for(j=0;j<=i;j++)
{
System.out.print(number+ " ");
number = number * (i - j) / (j + 1);
}
System.out.println();
}
}
catch(Exception e)
{

}
}
}
