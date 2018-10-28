import java.util.*;
class sum_n 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
try{
int n=sc.nextInt();
float sum=0.0f;
for(int i=1;i<=n;i++)
{
sum+=(float)1/i;
}
System.out.printf("%.2f",sum);
}
catch(Exception e)
{
System.out.println("ERROR");
}
}

}
