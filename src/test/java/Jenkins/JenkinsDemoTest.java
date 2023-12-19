package Jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsDemoTest {
	
	@Test
	public void printMsg()
	{
		Reporter.log("Jenkins maven mapped....");
	}
}
