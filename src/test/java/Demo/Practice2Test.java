package Demo;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Practice2Test 
{
	@Test(groups = "Regression")
	public void CarTest()
	{
		System.out.println("Yamaha Bike");
		System.out.println("Royal Enfield");
	}

}
