package lesson19.testsuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstClass {

    @Parameters({"username", "password"})
    @Test(groups = {"regression", "unit"})
    public void firstTest(String username, String password) {
        System.out.println("it is first test");
        System.out.println(username);
        System.out.println(password);
    }

    @Test
    public void secondTest() {
        System.out.println("it is second test");
    }
}
