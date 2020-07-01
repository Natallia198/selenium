package test.day5_TestNg_intro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNG {
    @BeforeMethod
    public void setUp(){
        System.out.println("before method is running");

    }
    @Test
    public void test1(){
        System.out.println("Test1 is running...");

    }
    @AfterMethod
    public void tearDown(){

    }
    @Test
    public void test2(){
        System.out.println("Test2 is running");
    }



}
