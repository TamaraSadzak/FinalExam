package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;

public class MyAccountTests extends BaseTest {

    public HomePage homePage;
    public MyAccountPage myAccountPage;
    public LoginPage loginPage;

    String myAccountPageTitle = "CREATE AN ACCOUNT";
    String emailaddress = "tamarasadzak93@yahoo.com";
    String firstName = "Tamara";
    String lastName = "Sadzak";
    String password = "gameofthrones";
    String address = "Primorska 18";
    String city = "Beograd";
    String postalCode = "22442";
    String mobilePhone = "0694206709";

    String userName = "tamarasadzak93@yahoo.com";
    String myPassword = "gameofthrones";
    String accountVerification = "Tamara Sadzak";

@Test
public void createAnAccount() {
    
    homePage = new HomePage(driver);
    myAccountPage = new MyAccountPage(driver);
       
    homePage.basePage();
    homePage.clickOnSignInButton();
    myAccountPage.createAnnCount(emailaddress);
    myAccountPage.createFirstAndLastName(firstName, lastName);
    myAccountPage.createEmailAddressandPassword(emailaddress, password);
    myAccountPage.createDwelling(address, city);
    myAccountPage.createState();
    myAccountPage.createPostalCodeAndMobilePhone(postalCode, mobilePhone);
    myAccountPage.clickOnRegisterButton();
    }
@Test
public void verifySucessfullCreatedAccount() {

    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);

    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.signIn(userName, myPassword);
    loginPage.verifyAccountTitle(accountVerification);
    }
}
