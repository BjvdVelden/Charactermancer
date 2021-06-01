package testCases;

import LoginSysteem.registerFunction;
import org.junit.Assert;

class registerFunctionTest {

    @org.junit.jupiter.api.Test
    void inputChecker() {
        registerFunction register = new registerFunction();
        Assert.assertEquals(true, register.inputChecker("bram"));
        Assert.assertEquals(false, register.inputChecker("<php>#delete</php>") );
    }

    @org.junit.jupiter.api.Test
    void checkStringSize() {
        registerFunction register = new registerFunction();
        Assert.assertEquals(false, register.checkStringSize("ditzijnmeerdan21tekens"));
        Assert.assertEquals(true, register.checkStringSize("coolegebruikersnaam"));


    }

    @org.junit.jupiter.api.Test
    void wachtwoordChecker() {
        registerFunction register = new registerFunction();
        Assert.assertEquals(false, register.wachtwoordChecker("1geheim"));
        Assert.assertEquals(false, register.wachtwoordChecker("Geheim"));
        Assert.assertEquals(false, register.wachtwoordChecker("1GEHEIM"));
        Assert.assertEquals(true, register.wachtwoordChecker("1Geheim"));

    }
}



