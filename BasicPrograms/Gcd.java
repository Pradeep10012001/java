class Gcd
{
  public static void main (String args[])
{
  Gcd obj=new Gcd();
   obj.twoNumber();
   obj.threeNumber();
}
public void twoNumber()
{
  int first=12;
  int second=46;
 int small=(first>second)?first:second;
  int gcd=0;
for(int i=1;i<=small;i++)
{
  if(first%i==0 && second%i==0)
   {
  gcd=i;
    }
}
   System.out.println(gcd);
}
public void threeNumber()
{
   int first=56;
    int second=93;
    int third =51;
  int small;
  int gcd=0;
  if(first<second&&first<third)
   {
    small=first;
   }
   else if(second<third)
   {
     small=second;
   }
   else 
   {
     small=third;
    }
   for(int i=1;i<=small;i++)
  {
    if(first%i==0 && second%i==0 &&third%i==0)
   {
      gcd=i;
   }
  }
System.out.println(gcd);
}


}
