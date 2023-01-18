package PracticeMaven;

import org.testng.annotations.Test;

public class CreateTest
{
	@Test
	public void createTest()
	{
		System.out.println("Project is created ");
	}
	@Test(groups="smoke")
	public void edit() {
		System.out.println("Edit Project ");
	}

}
