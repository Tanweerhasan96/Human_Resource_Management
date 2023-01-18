package PracticeMaven;

import org.testng.annotations.Test;

public class Update
{
	@Test
	public void update() {
		System.out.println("Project is Updated");
	}
	@Test(groups="smoke")
	public void delete()
	{
		System.out.println(" Project is deleted");
		
	}
}
