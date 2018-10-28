class GCD_LCM
{
public  static int findGcd(int no1,int no2) throws Exception
{
if(no2==0)
return no1;

return findGcd(no2,no1%no2);

}
public static void main(String args[])
{
try{
int no1=Integer.parseInt(args[0]);
int no2=Integer.parseInt(args[1]);
if(args.length>2)
throw new Exception();
int GCD=GCD_LCM.findGcd(no1,no2);
int LCM=(no1*no2)/GCD;
System.out.println(GCD+" "+LCM);
}
catch(Exception e)
{
System.out.println("ERROR");
}
}
}
