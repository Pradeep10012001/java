interface govBank
{
public void account();
public void checkBalance();
}
interface PvtBank
{
public void credited();
public void debited();
}
class test implements govBank,PvtBank
{
public void account()
{
System.out.println("account");

}
public void checkBalance()
{
System.out.println("balance");
}
public void credited()
{
System.out.println("credited");
}
public void debited(){
System.out.println("debited");
}
public static void main (String args[])
{
test t=new test();
t.account();
t.checkBalance();
t.credited();
t.debited();
}
}
