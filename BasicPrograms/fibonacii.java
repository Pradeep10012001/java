class fibonacii
{
public static void main(String args[])
{
  int sum=0;
 int first=0;
 int second=1;
for(int i=1;i<=10;i++)
{
  sum=first+second;
first=second;
second=sum;
  System.out.print(""+sum);
}


}

}
