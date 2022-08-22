class patternNumbers
{
public static void main(String args[])
{

patternNumbers obj=new patternNumbers();
obj.number0();
obj.number1();
obj.number2();
obj.number3();
obj.number4();
obj.number5();
obj.number6();
obj.number7();
obj.number8();
obj.number9();
}
public void number0(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(row==1||row==5||col==1||col==5)
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

public void number1(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(col==3)
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

public void number2(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(row==1||row==3||row==5||row==2&col==5||row==4&col==1)
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

public void number3(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(row==1||row==5||row==3||row==2&col==5||row==4&col==5)
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

public void number4(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(row==3||col==5||row==2&col==1||row==1&col==1)
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
public void number5(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(row==1||row==3||row==5||row==2&col==1||row==4&col==5)
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
public void number6(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(col==1||row==5||row==3||row==4&col==5)
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
public void number7(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(col==4||row==1&col==1||row==1&col==2||row==1&col==3)
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
public void number8(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(row==1||row==3||row==5||col==1||col==5)
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
public void number9(){

for(int row=1;row<=5;row++)
{

for(int col=1;col<=5;col++)
{
 if(row==1||row==3||row==5||row==2&col==1||row==2&col==5||row==4&col==5)
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
