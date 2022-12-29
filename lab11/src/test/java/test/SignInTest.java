package test;

import model.User;
import org.testng.annotations.Test;
import page.SignIn;
import service.UserCreator;

public class SignInTest extends CommonConditions{

    @Test
    public void Singin() throws InterruptedException {
        User testUser = UserCreator.withCredentialsFromProperty();
        SignIn signIn = new SignIn(driver)
                .openPage()
                .emailclick(testUser);
    }
}