package TestCases;
import org.testng.annotations.Test;

public class Class4 {
	
	@Test
	public void class1Method()
	{
		System.out.println("Class 4 Method");
		String s = "I am from Banglore";
		String [] st = s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String str=st[i];
			StringBuffer rev = new StringBuffer(str);
			System.out.print(rev.reverse()+" ");
		}
	}

}
