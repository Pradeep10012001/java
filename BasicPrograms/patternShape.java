class angle
{

public static void main(String args[])
{
angle obj=new angle();
obj.righttriangle();
obj.lefttriangle();
obj. pyramid();
obj.diamond();
}
public void righttriangle()
{
for(int row=1;row<=5;row++)
{
for(int col=1;col<=row;col++)
{
  System.out.print("*");
}

System.out.println( );
}
}
public void lefttriangle()
{
for(int row=1;row<=5;row++)
{
  for(int space=4;space>=row;space--)
  {
    System.out.print(" ");
  }
  for(int star=1;star<=row;star++)
  {
  System.out.print("*");
  }
  System.out.println();
}
}
public void pyramid()
{
for(int row=1;row<=5;row++)
{
  for(int space=4;space>=row;space--)
  {
    System.out.print(" ");
  }
  for(int star=1;star<=row;star++)
  {
  System.out.print("*");
  }
for(int star=1;star<row;star++)
  {
  System.out.print("*");
  }
  System.out.println();
}


}
public void diamond()
{
for(int row=1;row<5;row++)
{
  for(int space=4;space>=row;space--)
  {
    System.out.print(" ");
  }
  for(int star=1;star<=row;star++)
  {
  System.out.print("*");
  }
for(int star=1;star<row;star++)
  {
  System.out.print("*");
  }
  System.out.println();
}
for(int row=5;row>=1;row--)
{
  for(int space=4;space>=row;space--)
  {
    System.out.print(" ");
  }
  for(int star=1;star<=row;star++)
  {
  System.out.print("*");
  }
for(int star=1;star<row;star++)
  {
  System.out.print("*");
  }
  System.out.println();
}

}

}
