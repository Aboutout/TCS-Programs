import java.util.*;
class Amstrong
{
public static void main(String args[])
{
try{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a;i<=b;i++){
int temp=i,c=0;
while(temp>=1){
int temp1=temp%10;
c=c+temp1*temp1*temp1;
temp/=10;
}
if(i==c)
 System.out.println(c);
}
}
catch(Exception e)
{
System.out.println("ERROR");
}
}
}
