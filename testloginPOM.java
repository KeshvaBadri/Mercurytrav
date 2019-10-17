package test;



import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.firefox.FirefoxDriver;



import org.testng.Assert;



import org.testng.annotations.BeforeTest;



import org.testng.annotations.Test;



import pages.KeshvaHomePage;



import pages.KeshvaLogin;



public class Test9KeshvaLogin {



    WebDriver driver;



    KeshvaLogin objLogin;



    KeshvaHomePage objHomePage;



    @BeforeTest



    public void setup(){



        driver = new FirefoxDriver();



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        driver.get("http://newtours.demoaut.com/");



    }



    /**



     * This test case will login in http://newtours.demoaut.com/



     * Verify login page title as Keshva bank



     * Login to application



     * Verify the home page using Dashboard message



     */



    @Test(priority=0)



    public void test_Home_Page_Appear_Correct(){



        //Create Login Page object



    objLogin = new KeshvaLogin(driver);



    //Verify login page title



    String loginPageTitle = objLogin.getLoginTitle();



    Assert.assertTrue(loginPageTitle.toLowerCase().contains("Keshva bank"));



    //login to application



    objLogin.loginToKeshva("mgr123", "mgr!23");



    // go the next page



    objHomePage = new KeshvaHomePage(driver);



    //Verify home page



    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));



    }
