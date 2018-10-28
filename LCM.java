class LCM
{
public static void main(String args[])
{
int no1=Integer.parseInt(args[0]);
int no2=Integer.parseInt(args[1]);
int x=no1;
int y=no2;
while(x!=y)
{
if(x>y)
 x=x-y;
else
y=y-x;
}
System.out.println(no1*no2/x);
}
}

