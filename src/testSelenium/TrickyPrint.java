package testSelenium;

public class TrickyPrint {
	
	public static void main(String[] args) 
	{
		System.out.println(10 + 20 + "Hello" + (30 + 40));  //30Hello70
		System.out.println(10 + 20 + "Hello" + 30 + 40);  //30Hello3040
	}

}

