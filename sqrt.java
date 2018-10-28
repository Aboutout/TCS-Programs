class sqrt
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
float i=0.001f;
while(i*i<=n)
{
i+=0.001f;
}
i=i-0.001f;
System.out.printf("%.2f",i);
}
}
