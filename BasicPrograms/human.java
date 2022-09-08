
public class human {
   int balance=5000;
   
	public static void main(String[] args) {
		human h=new human();
		int ws=h.account(467, 9364);
        System.out.println(ws);
	}
  public int account(int acno,int amt) {
	
	  int balance=6700;
	   int bankbal=balance+this.balance+amt;
	return bankbal ;
	  
  }
}

