public class Message {

	public static void main(String[] args) {
		Message m=new Message ();
		m.demo();

	}
	public void demo() {
		char []a= {'g','k','m','u','c','t'};
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				int m=a[i];
				m=m+2;
				
				char b=(char) m;
				a[i]=b;
			}
			if(i%2!=0) {
				int m=a[i];
				m=m+1;
				
				char b=(char) m;
				a[i]=b;
			}
			System.out.print(a[i]+" ");
		}
	}

}

