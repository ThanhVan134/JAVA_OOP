package common;

public class BaseTest {
  public void createDriver(){
    System.out.println("Browser:" + Constants.getBrowser());
    System.out.println("Report:"+Constants.isReport());
    System.out.println("Headless:"+Constants.isHeadless());

    }
    public void closeDriver(){
      System.out.println("Close Browser:"+Constants.getBrowser());

    }
}
