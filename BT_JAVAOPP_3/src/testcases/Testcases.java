package testcases;

import common.BaseTest;
import common.Constants;

public class Testcases extends BaseTest {
    public void testLogin(){
        Constants.setBrowser("Chrome");
        Constants.setHeadless(true);
        Constants.setReport(false);
        createDriver();

        System.out.println("Step 1: Open Login page");
        System.out.println("Step 2: Input 'Username' and ' Password' are couple in DB");
        System.out.println("Step 3: Click on [ Login ] button");

        closeDriver();

    }
    public void testAddCategories(){
        Constants.setBrowser("Firefox");
        Constants.setHeadless(true);
        Constants.setReport(false);
        createDriver();

        System.out.println("Step 1: Navigate to category page");
        System.out.println("Step 2: Click on button [Add a new category]");
        System.out.println("Step 3: Input valid data into remain fields. ");
        System.out.println("Step 4: Click on button [Save] ");

        closeDriver();
    }
}
