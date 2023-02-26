package Proje;

import org.junit.Assert;

import Utulity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProjeTestingTools extends BaseDriver {

    @Test
    public void TestCase1() {


        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement signUp = driver.findElement(By.xpath("//a[@class='nav-link' and @href='/UserRegister/NewUser']"));
        signUp.click();


        BaseDriver.Bekleme(2);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Kadir");


        BaseDriver.Bekleme(2);
        WebElement surName = driver.findElement(By.xpath("//input[@id='Surname']"));
        surName.sendKeys("Caglar");


        BaseDriver.Bekleme(2);
        WebElement ePosta = driver.findElement(By.xpath("//input[@id='E_post']"));
        ePosta.sendKeys("kcaglar@gmail.com");


        BaseDriver.Bekleme(2);
        WebElement mobile = driver.findElement(By.xpath("//input[@id='Mobile']"));
        mobile.sendKeys("1234564785");


        BaseDriver.Bekleme(2);
        WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
        userName.sendKeys("KadirD");


        BaseDriver.Bekleme(2);
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");


        BaseDriver.Bekleme(2);
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("123456");


        BaseDriver.Bekleme(2);
        WebElement submit = driver.findElement(By.xpath("//input[@id='submit']"));
        submit.click();


        BaseDriver.Bekleme(2);
        WebElement registration = driver.findElement(By.xpath("//div[@class='col-md-offset-2 col-md-2']/label[@class='label-success']"));


        Assert.assertTrue(registration.getText().contains("Registration Successful"));
        BaseDriver.Bekleme(3);

    }

    @Test
    public void TestCase2() {

        driver.get("https://itera-qa.azurewebsites.net/");


        WebElement login = driver.findElement(By.xpath("//a[@class='nav-link'][@href='/Login']"));
        login.click();
        BaseDriver.Bekleme(2);


        WebElement userName1 = driver.findElement(By.xpath("//input[@id='Username'][@type='text']"));
        userName1.sendKeys("KadirD");
        BaseDriver.Bekleme(2);


        WebElement password1 = driver.findElement(By.xpath("//input[@id='Password']"));
        password1.sendKeys("123456");
        BaseDriver.Bekleme(2);


        WebElement login1 = driver.findElement(By.xpath("//input[@class='btn btn-primary'][@type='submit']"));
        login1.click();
        BaseDriver.Bekleme(2);


        WebElement dogrulama = driver.findElement(By.xpath("//div/h3"));
        Assert.assertTrue(dogrulama.getText().startsWith("Welcome"));
        BaseDriver.Bekleme(2);

    }

    @Test
    public void TestCase3 () {


        WebElement create = driver.findElement(By.xpath("//*[@href='/Customer/Create']"));
        create.click();
        BaseDriver.Bekleme(2);


        WebElement name = driver.findElement(By.xpath("//input[@class='form-control text-box single-line'][@id='Name']"));
        name.sendKeys("Kadir");
        BaseDriver.Bekleme(2);


        WebElement company = driver.findElement(By.xpath("//input[@class='form-control text-box single-line'][@id='Company']"));
        company.sendKeys("TechnoStudy");
        BaseDriver.Bekleme(2);


        WebElement addres = driver.findElement(By.xpath("//input[@class='form-control text-box single-line'][@id='Address']"));
        addres.sendKeys("Yavuzselim cad ");
        BaseDriver.Bekleme(2);


        WebElement city = driver.findElement(By.xpath("//input[@class='form-control text-box single-line'][@id='City']"));
        city.sendKeys("Samsun");
        BaseDriver.Bekleme(2);


        WebElement phone = driver.findElement(By.xpath("//input[@class='form-control text-box single-line'][@id='Phone']"));
        phone.sendKeys("05545554448");
        BaseDriver.Bekleme(2);


        WebElement eMail = driver.findElement(By.xpath("//input[@class='form-control text-box single-line'][@id='Email']"));
        eMail.sendKeys("kcaglar@gmail.com");
        BaseDriver.Bekleme(2);


        WebElement create1 = driver.findElement(By.xpath("//input[@value='Create']"));
        create1.click();
        BaseDriver.Bekleme(2);


        BaseDriver.Beklekapat();


    }
}
