package lesson18.annotations.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Method Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Method Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Method Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Method Before Method");
    }

    @Test
    public void test() {
        System.out.println("Our first test");
    }

    @Test
    public void test2() {
        System.out.println("Our second test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Method After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Method After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Method After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Method After Suite");
    }
}
