public class FizzBuzz {
	public static void main (String[] args){
		for (int x=1;x<101;x++)
		{
		byte verfication=0;
		String output =new String("");
		if(x%3==0)
		{
			output=output+"Fizz";
			verfication=1;
		}
		if(x%5==0)
		{
			output=output+"Buzz";
			verfication=1;
		}
		if(verfication==1)
			System.out.println(output);
		else
			System.out.println(x);
		
		}
	}
}