class common
{
public static void main(String args[])
{
int arr1[]={10,20,30,40,50};
int arr2[]={30,40,50,60,70};
int arr3[]={40,50,80,90,25};
for(int i=0;i<arr1.length;i++)
{
int a=arr1[i];
for(int j=0;j<arr2.length;j++)
{
if(arr2[j]==a)
{
for(int k=0;k<arr3.length;k++)
{
if(arr3[k]==a)
System.out.print(a);
}
}
}
}
}
}
