class alphapet
{
public static void main(String args[])
{

alphapet obj=new alphapet();
obj.letterA();
obj.letterB();
obj.letterC();
obj.letterD();
obj.letterE();
obj.letterF();
}
public void letterA()
{
for(int row=1;row<=4;row++)
{
 for(int col=1;col<=5;col++)
   {
    if(row==3||row==4&col==5||row==4&col==1||row==1&col==3||row==2&col==2||row==2&col==4)
    {
   System.out.print("*");
     }
   else
   {
   System.out.print(" ");
   }
}
System.out.println( );
}
}
public void letterB()
{
for(int row=1;row<=5;row++)
{
 for(int col=1;col<=5;col++)
   {
    if(col==1||row==1||row==3||row==5||col==5&row==2||col==5&row==4)
    {
   System.out.print("*");
     }
   else
   {
   System.out.print(" ");
   }
}
System.out.println( );
}
}
public void letterC()
{
for(int row=1;row<=4;row++)
{
 for(int col=1;col<=4;col++)
   {
    if(row==1&col==2||row==1&col==3||row==1&col==4||col==1&row==2||col==1&row==3||row==4&col==2||row==4&col==3||row==4&col==4)
    {
   System.out.print("*");
     }
   else
   {
   System.out.print(" ");
   }
}
System.out.println( );
}
}
public void letterD()
{
for(int row=1;row<=4;row++)
{
 for(int col=1;col<=4;col++)
   {
    if(col==1||row==1&col==2||row==1&col==3||row==2&col==4||col==4&row==3||row==4&col==2||row==4&col==3)
    {
   System.out.print("*");
     }
   else
   {
   System.out.print(" ");
   }
}
System.out.println( );
}
}
public void letterE()
{
for(int row=1;row<=5;row++)
{
 for(int col=1;col<=4;col++)
   {
    if(row==1||row==3||row==5||col==1)
    {
   System.out.print("*");
     }
   else
   {
   System.out.print(" ");
   }
}
System.out.println( );
}
}
public void letterF()
{
for(int row=1;row<=5;row++)
{
 for(int col=1;col<=4;col++)
   {
    if(row==1||row==3||col==1)
    {
   System.out.print("*");
     }
   else
   {
   System.out.print(" ");
   }
}
System.out.println( );
}
}
}

