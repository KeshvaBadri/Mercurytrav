package pages;



import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;



public class KeshvaLogin {



    WebDriver driver;



    By user9KeshvaName = By.name("uid");



    By password9Keshva = By.name("password");



    By titleText =By.className("barone");



    By login = By.name("btnLogin");



    public KeshvaLogin(WebDriver driver){



        this.driver = driver;



    }



    //Set user name in textbox



    public void setUserName(String strUserName){



        driver.findElement(user9KeshvaName).sendKeys(strUserName);



    }



    //Set password in password textbox



    public void setPassword(String strPassword){



         driver.findElement(password9Keshva).sendKeys(strPassword);



    }



    //Click on login button



    public void clickLogin(){



            driver.findElement(login).click();



    }



    //Get the title of Login Page



    public String getLoginTitle(){



     return    driver.findElement(titleText).getText();



    }



    /**



     * This POM method will be exposed in test case to login in the application



     * @param strUserName



     * @param strPasword



     * @return



     */



    public void loginToKeshva(String strUserName,String strPasword){



        //Fill user name



        this.setUserName(strUserName);



        //Fill password



        this.setPassword(strPasword);



        //Click Login button



        this.clickLogin();        

    }



}
