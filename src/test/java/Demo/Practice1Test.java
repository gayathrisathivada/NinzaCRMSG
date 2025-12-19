package Demo;

import org.testng.annotations.Test;

public class Practice1Test 
{
	@Test(groups = "Smoke")
	public void CarTest()
	{
		System.out.println("Audi");
		System.out.println("Benz");
		System.out.println("KIA");
	}

}
