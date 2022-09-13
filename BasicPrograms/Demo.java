public class Demo {

	public static void main(String[] args) {
		int age[]= {67,98,65,34,93,63,12,99};
      int oddsum=0;
		int evensum=0;
		for(int i=0;i<age.length;i++)
		{
      if(age[i]%2==0)
	{
     evensum=evensum+age[i];
    }
      else 
			{
	    oddsum=oddsum+age[i];
       }
}
		System.out.println(oddsum-evensum);
		
	}}
