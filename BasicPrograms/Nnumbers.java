class Nnumbers
{
public static void main(String args[])
{
Nnumbers obj=new Nnumbers();
obj.add();
obj.sub();
obj.mul();
}
public void add(){

 int n=15;
  int sum=0;
for(int i=1;i<=n;i++)
{
   sum=sum+i;
}
System.out.println("sum is :"+sum);
}
public void sub(){
  int n=15;
  int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum-i;
}
System.out.println("sum is :"+sum);
}
public void mul(){
  int n=10;
  int sum=1;
for(int i=1;i<=n;i++)
{
sum=sum*i;
}
System.out.println("sum is :"+sum);
}}

