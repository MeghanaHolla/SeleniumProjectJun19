package kdf;

import java.io.IOException;

import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	@Test
	public void applicationLoginTest() throws IOException {
		String[][] data = GenericMethods.getData("D:\\SelMay13\\TestData.xlsx", "Sheet2");
		for(int i = 1;i<data.length;i++) {
			//Code modified after enhancement in the application as part of Realeas1.1
			switch(data[i][3]) {
			case "openBrowser":
				Methods.openBrowser();
				break;
			case "maxBrowser":
				Methods.maximizeBrowser();
				break;
			case "impWait":
				Methods.implicitlyWait();
				break;
			case "navToApplication":
				Methods.navigateToApplication(data[i][6]);
				break;
			case "enterUserID":
				Methods.enterUserID(data[i][4],data[i][5], data[i][6]);
				break;
			case "enterPassword":
				Methods.enterPassword(data[i][4],data[i][5], data[i][6]);
				break;
			case "clickLogin":
				Methods.clickSubmit(data[i][4],data[i][5]);
				break;
			case "verifyErrMsg":
				Methods.verifyErrorMessage(data[i][5], data[i][6]);
				break;
			case "closeApp":
				Methods.closeApplication();
				break;
			}
		}
	}

}
