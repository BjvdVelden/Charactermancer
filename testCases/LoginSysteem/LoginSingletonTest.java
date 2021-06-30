package LoginSysteem;

import org.junit.Assert;

class LoginSingletonTest {

    @org.junit.jupiter.api.Test
    void Login() {
        LoginSingleton.getInstantiate().Login("Admin","Admin");

        Assert.assertEquals(true, LoginSingleton.getInstantiate().isLoggedIn());

    }

    @org.junit.jupiter.api.Test
    void LoggOut(){
        LoginSingleton.getInstantiate().logOut();

        Assert.assertEquals(false, LoginSingleton.getInstantiate().isLoggedIn());
    }


    @org.junit.jupiter.api.Test
    void Register(){
        LoginSingleton.getInstantiate().Register("GivanStaub","#1Geheim");
        Assert.assertEquals(true, LoginSingleton.getInstantiate().isLoggedIn());
    }
}